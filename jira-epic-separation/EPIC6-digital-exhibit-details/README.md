# EPIC6 - Digital Exhibit Details

Jira item from the screenshot:

- SCRUM-86: View Museum and Temple Details

Main copied files:

- `src/main/resources/web/index.html`
- `src/main/resources/web/app.js`
- `src/main/resources/web/styles.css`
- `src/main/resources/web/img/`
- `src/main/java/explorer/MonumentServer.java`
- `src/main/java/explorer/data/Monument.java`
- `src/main/java/explorer/data/MonumentRepository.java`
- `src/main/java/explorer/data/MonumentService.java`
- `tests/explorer/tests/ApiIntegrationTest.java`

Useful code areas:

- Detail page layout: `index.html` details section.
- Detail rendering: `app.js` function `renderSelectedDetail`.
- Opening detail views: `app.js` functions `selectMonument` and `createMonumentCard`.
- Detail API route: `MonumentServer.java` `/api/monuments/{slug}` handler.
- Detail payload: `MonumentService.java` methods `findBySlug` and `toDetail`.
- Museum/temple content and gallery images: `MonumentRepository.java` plus `src/main/resources/web/img/`.
