# EPIC2 - Legacy Historical Timeline

Jira items from the screenshots:

- SCRUM-9: View Monument from Timeline
- SCRUM-80: View Historical Timeline

Main copied files:

- `src/main/resources/web/index.html`
- `src/main/resources/web/app.js`
- `src/main/resources/web/styles.css`
- `src/main/java/explorer/MonumentServer.java`
- `src/main/java/explorer/data/Monument.java`
- `src/main/java/explorer/data/MonumentRepository.java`
- `src/main/java/explorer/data/MonumentService.java`
- `tests/explorer/tests/ApiIntegrationTest.java`

Useful code areas:

- Timeline HTML section: `index.html` timeline section.
- Timeline rendering: `app.js` function `renderTimeline`.
- Opening a monument from the timeline: `app.js` function `selectMonument`.
- Timeline metadata: `MonumentService.java` methods `meta` and `timelineGroup`.
- API coverage: `ApiIntegrationTest.java` checks that `/api/meta` exposes `timelineGroups`.
