# EPIC5 - Multilingual Translation

Jira items from the screenshots:

- SCRUM-13: Language Selection for Monument Information
- SCRUM-14: Translate Monument Information into User Language

Main copied files:

- `src/main/resources/web/index.html`
- `src/main/resources/web/app.js`
- `src/main/resources/web/styles.css`
- `src/main/java/explorer/data/Monument.java`
- `src/main/java/explorer/data/MonumentRepository.java`
- `src/main/java/explorer/data/MonumentService.java`

Useful code areas:

- Language button: `index.html` nav button with `id="languageButton"`.
- UI translations: `app.js` `translations` object.
- Language switch behavior: `app.js` `bindEvents` language button handler.
- Applying translated labels and direction: `app.js` functions `applyTranslations`, `getText`, `t`, and `humanize`.
- Bilingual monument content: `MonumentRepository.java` data records and `Monument.java` localized fields.
