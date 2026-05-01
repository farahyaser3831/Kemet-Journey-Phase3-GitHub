# GitHub Steps for Phase 3

Follow these steps in GitHub Desktop.

## 1. Create the Repository

1. Open GitHub Desktop.
2. Click `File > Add local repository`.
3. Select the Desktop folder:
   `C:\Users\farah\Desktop\Kemet-Journey-Phase3-GitHub`
4. If GitHub Desktop says it is not a repository, click `Create a repository`.
5. Repository name: `Kemet-Journey-Phase3-GitHub`
6. Keep the branch as `main`.
7. Click `Create repository`.

## 2. Commit the Initial Project

1. In GitHub Desktop, review the changed files.
2. In the commit summary box, write:
   `Initial Phase 3 project with Jira epic separation`
3. Click `Commit to main`.
4. Click `Publish repository`.
5. Choose `Private` unless your instructor asked for a public repository.
6. Click `Publish Repository`.

## 3. Create Feature Branches for Jira Epics

Create one branch per epic:

- `feature/epic1-monument-discovery-filtering`
- `feature/epic2-legacy-historical-timeline`
- `feature/epic3-user-profile-favorites`
- `feature/epic4-location-exploration`
- `feature/epic5-multilingual-translation`
- `feature/epic6-digital-exhibit-details`

For each branch:

1. Click `Current Branch`.
2. Click `New Branch`.
3. Paste the branch name.
4. Click `Create Branch`.
5. Make or review the epic-specific changes.
6. Run:
   `.\scripts\test.ps1`
7. Commit with a clear message, for example:
   `Complete EPIC3 user profile and favorites`
8. Click `Push origin`.

## 4. Open Pull Requests

For each branch:

1. Click `Create Pull Request`.
2. On GitHub, set the base branch to `main`.
3. In the Pull Request description, mention the Jira item numbers from `jira-epic-separation/README.md`.
4. Add a short test note:
   `Ran .\scripts\test.ps1 - MonumentServiceTest passed, ApiIntegrationTest passed.`
5. Ask a teammate for review.

## 5. Review and Merge

1. Teammate checks the code and the Phase 3 checklist.
2. If changes are requested, fix them on the same branch and push again.
3. When approved, click `Merge Pull Request`.
4. In GitHub Desktop, switch back to `main`.
5. Click `Fetch origin`, then `Pull origin`.

## 6. Final Submission Check

Before submitting:

1. Make sure `main` has the latest merged work.
2. Run:
   `.\scripts\test.ps1`
3. Confirm these files exist:
   - `PHASE3-CHECKLIST.md`
   - `GITHUB-STEPS-PHASE3.md`
   - `jira-epic-separation/README.md`
4. Submit the GitHub repository link.
