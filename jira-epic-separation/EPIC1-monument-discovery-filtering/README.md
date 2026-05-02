# EPIC1 - Monument Discovery and Filtering

Jira items from the screenshots:

- SCRUM-1: View Filtered Results
- SCRUM-7: Filter Monuments by Criteria
- SCRUM-8: View Historical Timeline, shown under EPIC1 in the backlog screenshot

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

- Filter UI: `index.html` around the search/filter controls.
- Filter events and client-side filtering: `app.js` functions `bindEvents`, `updateFilteredMonuments`, `populateFilters`, and `getVisibleMonuments`.
- Filter API query handling: `MonumentServer.java` in the `/api/monuments` handler.
- Backend filtering and metadata: `MonumentService.java` methods `findAll` and `meta`.
Branch review note: View Filtered Result.