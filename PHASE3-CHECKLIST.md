# Phase 3 Checklist

Source document: `Phase 3 (1).docx`

This checklist maps the Kemet Journey project to the Phase 3 requirements: coding, testing, and review around the actual features/user stories.

## Implementation Requirements

- The project implements the user stories shown in the Jira screenshots:
  - EPIC1: monument search, filtering, and filtered results.
  - EPIC2: historical timeline and opening a monument from the timeline.
  - EPIC3: user profile/login-style local profile and favorites.
  - EPIC4: exploring monuments by location.
  - EPIC5: English/Arabic language selection and translated monument information.
  - EPIC6: museum/temple detail pages and digital exhibit content.
- The project builds and runs locally using the included PowerShell scripts:
  - Run: `.\scripts\run.ps1`
  - Test: `.\scripts\test.ps1`

## Code Quality Checklist

- Code follows clear indentation, naming, and structure.
- Java backend code is separated into server, data model, repository, service, and web helper classes.
- Frontend code is organized around state, rendering functions, event binding, translations, and localStorage behavior.
- No commented-out code was found in the source files.
- No obvious unused variables were introduced during the epic separation work.
- Duplicated generated output is excluded from GitHub through `.gitignore`.

## Testing Checklist

- Happy path tested:
  - Monument API returns monument lists.
  - Detail API returns a selected monument.
  - Metadata API returns timeline and filter data.
- Edge cases tested:
  - Missing monument slug returns `404`.
  - Combined filters narrow results.
- Negative tests:
  - Unknown monument endpoint is covered by the integration test.
- Crash check:
  - `MonumentServiceTest` and `ApiIntegrationTest` pass locally.

## Review Checklist

- Self-review completed by checking the project structure, Jira epic mapping, and Phase 3 requirements.
- Peer review should be completed through a GitHub Pull Request before merging feature branches into `main`.
- All requirements from the QA/Jira assignment are represented in the `jira-epic-separation` folder and summarized in its README.

## Latest Local Test Result

Run this before committing:

```powershell
.\scripts\test.ps1
```

Expected output:

```text
MonumentServiceTest passed
ApiIntegrationTest passed
```
