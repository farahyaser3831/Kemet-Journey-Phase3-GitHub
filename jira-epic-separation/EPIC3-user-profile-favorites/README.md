# EPIC3 - User Profile and Favorites

Jira items from the screenshots:

- SCRUM-10: User Login
- SCRUM-11: Add Monument to Favorites

Main copied files:

- `src/main/resources/web/index.html`
- `src/main/resources/web/app.js`
- `src/main/resources/web/styles.css`

Useful code areas:

- Login/profile modal: `index.html` auth dialog.
- Favorites UI: `index.html` favorites button, favorites section, and monument card template.
- Login/profile behavior: `app.js` functions `saveProfile` and `logoutProfile`.
- Favorites behavior: `app.js` functions `toggleFavorite`, `renderFavorites`, `renderFavoritesCount`, `favoritesStorageKey`, `loadFavorites`, and `persistFavorites`.

This epic is mostly frontend/localStorage based and does not require backend changes in the current project.
