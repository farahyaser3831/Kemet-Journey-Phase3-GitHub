$ErrorActionPreference = "Stop"

$root = Split-Path -Parent $PSScriptRoot
$maven = Get-Command mvn -ErrorAction SilentlyContinue

if ($maven) {
    Push-Location $root
    try {
        mvn test
        exit $LASTEXITCODE
    } finally {
        Pop-Location
    }
}

$junitVersion = "1.10.2"
$junitDir = Join-Path $root ".junit"
$junitJar = Join-Path $junitDir "junit-platform-console-standalone-$junitVersion.jar"
$junitUrl = "https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/$junitVersion/junit-platform-console-standalone-$junitVersion.jar"

if (-not (Test-Path $junitJar)) {
    New-Item -ItemType Directory -Force -Path $junitDir | Out-Null
    Write-Host "Maven was not found. Downloading JUnit Platform Console Standalone $junitVersion..."
    Invoke-WebRequest -Uri $junitUrl -OutFile $junitJar
}

$buildDir = Join-Path $root "build"
$classesDir = Join-Path $buildDir "classes"
$testClassesDir = Join-Path $buildDir "test-classes"

if (Test-Path $classesDir) {
    Remove-Item -Recurse -Force $classesDir
}

if (Test-Path $testClassesDir) {
    Remove-Item -Recurse -Force $testClassesDir
}

New-Item -ItemType Directory -Force -Path $classesDir | Out-Null
New-Item -ItemType Directory -Force -Path $testClassesDir | Out-Null

$sources = Get-ChildItem -Path (Join-Path $root "src\main\java") -Recurse -Filter *.java | ForEach-Object { $_.FullName }
$tests = Get-ChildItem -Path (Join-Path $root "src\test\java") -Recurse -Filter *.java | ForEach-Object { $_.FullName }

javac -encoding UTF-8 -d $classesDir $sources
javac -encoding UTF-8 -cp "$junitJar;$classesDir" -d $testClassesDir $tests

java -jar $junitJar --class-path "$classesDir;$testClassesDir" --scan-class-path
