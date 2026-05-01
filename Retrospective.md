# Sprint 3 Retrospective — Library Booking System

## Sprint Goal
Build a full stack booking system with REST API
and web frontend for managing library book reservations.

## Result
 Sprint Goal achieved — all 5 user stories completed.

## What went well
- MVC architecture applied confidently from Project 2 experience
- JPA derived query methods (findByBookTitle, findByActiveTrue)
  eliminated need for custom SQL
- Frontend connected to API with plain HTML and JavaScript —
  no framework needed
- Cancel vs Delete distinction shows real-world thinking
- Full Scrum artifacts maintained throughout — backlog,
  daily standup, review, retrospective
- Screenshots committed to GitHub as transparent proof of work
- - Frontend refactored into separate HTML, CSS and JS files
    following separation of concerns best practice

## What could improve
- Maven pom.xml had errors from Spring Initializr —
  need to verify dependencies immediately after generation
- Should have tested the frontend connection to API earlier
  instead of building everything first
- Package structure still not following Spring Boot conventions —
  to fix in future projects

## Action points for future projects
- Always verify pom.xml dependencies before writing any code
- Follow standard Spring Boot package structure from day one:
  all packages inside main application package
- Add Spring Security authentication as next learning step
- Consider adding unit tests with JUnit in future sprints

## Scrum values reflection
- **Transparency**: daily standup, backlog and GitHub
  screenshots show honest progress 
- **Inspection**: retrospective identifies recurring issues
  like package structure 
- **Adaptation**: lessons from Project 2 applied to Project 3 
- **Commitment**: all sprint goals achieved across 3 projects 
- **Focus**: each project built one layer at a time 