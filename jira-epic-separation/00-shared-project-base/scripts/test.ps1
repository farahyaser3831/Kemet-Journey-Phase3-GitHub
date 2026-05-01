$ErrorActionPreference = "Stop"

$root = Split-Path -Parent $PSScriptRoot
$buildDir = Join-Path $root "build"
$classesDir = Join-Path $buildDir "test-classes"

if (Test-Path $classesDir) {
    Remove-Item -Recurse -Force $classesDir
}

New-Item -ItemType Directory -Force -Path $classesDir | Out-Null

$sources = Get-ChildItem -Path (Join-Path $root "src") -Recurse -Filter *.java | ForEach-Object { $_.FullName }
$tests = Get-ChildItem -Path (Join-Path $root "tests") -Recurse -Filter *.java | ForEach-Object { $_.FullName }

javac -encoding UTF-8 -d $classesDir $sources $tests

java -cp $classesDir explorer.tests.MonumentServiceTest
java -cp $classesDir explorer.tests.ApiIntegrationTest
