# Egyptian Monuments Explorer

A modern, interactive tourism website focused on Egyptian monuments and historical landmarks.

## Stack

- Java 17 backend using the built-in `HttpServer`
- Vanilla HTML, CSS, and JavaScript frontend
- JSON API for monument data, filtering, and search
- LocalStorage-powered favorites
- JUnit 5 tests for service and API behavior

## Features

- Immersive homepage with Ancient Egypt-inspired visual direction
- Monument exploration grid with search and filters
- Detailed monument view with facts, history, and image gallery
- English and Arabic language switching
- Favorites/bookmarks
- Timeline and interactive Egypt map
- Responsive layout and graceful empty states

## Run

```powershell
./scripts/run.ps1
```

The app starts on `http://localhost:8080`.

## Test

```powershell
./scripts/test.ps1
```

The test script runs JUnit 5 tests. If Maven is installed, it uses `mvn test`; otherwise it downloads the JUnit Platform Console runner into `.junit/` and runs the tests directly.
