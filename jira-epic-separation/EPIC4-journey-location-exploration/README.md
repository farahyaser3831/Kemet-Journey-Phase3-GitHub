# EPIC4 - Journey Location Exploration

Jira item from the screenshot:

- SCRUM-12: Explore Monuments by Location

Main copied files:

- `src/main/resources/web/index.html`
- `src/main/resources/web/app.js`
- `src/main/resources/web/styles.css`
- `src/main/java/explorer/MonumentServer.java`
- `src/main/java/explorer/data/Monument.java`
- `src/main/java/explorer/data/MonumentRepository.java`
- `src/main/java/explorer/data/MonumentService.java`
- `tests/explorer/tests/MonumentServiceTest.java`
- `tests/explorer/tests/ApiIntegrationTest.java`

Useful code areas:

- Location/map UI: `index.html` regions/map section.
- Location interaction: `app.js` functions `renderMap` and `applyLocationFilter`.
- Location filter options: `app.js` function `populateFilters`.
- Backend location grouping: `MonumentService.java` method `regionGroup`.
- API query handling for `location`: `MonumentServer.java` `/api/monuments` handler.
