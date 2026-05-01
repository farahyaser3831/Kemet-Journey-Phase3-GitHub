param(
    [int]$Port = 8080
)

$ErrorActionPreference = "Stop"

$root = Split-Path -Parent $PSScriptRoot
$buildDir = Join-Path $root "build"
$classesDir = Join-Path $buildDir "classes"

if (Test-Path $classesDir) {
    Remove-Item -Recurse -Force $classesDir
}

New-Item -ItemType Directory -Force -Path $classesDir | Out-Null

$sources = Get-ChildItem -Path (Join-Path $root "src") -Recurse -Filter *.java | ForEach-Object { $_.FullName }

javac -encoding UTF-8 -d $classesDir $sources

java -cp $classesDir explorer.Main $Port
