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


 
## Sprint Maintenance Docker Spike - Retrospective 

**Date:** 16/05/2026 (Day 2 of the spike was dedicated to this project)

### What went well 
- Docker knowledge transferred immediately from Project 2 to Project 3
- Full stack app (backend + frontend) containerized with no additional
  complexity — Spring Boot serves static resources inside the JAR
- Two services containerized in a 2-day spike as planned

### What could be improved 
- A docker-compose.yml would allow running both services together
  with a single command — planned for next sprint
- No persistent storage yet — H2 resets on container restart

### What I learned 
- Docker muscle memory builds fast — second containerization took
  half the time of the first
- Spring Boot embeds static frontend resources in the JAR —
  no separate container needed for HTML/CSS/JS frontend
- Multi-service Docker setups naturally lead toward
  docker-compose and Kubernetes

### Next Steps 
- docker-compose.yml to orchestrate Project 2 + Project 3 together
- Kubernetes basics — explore deployment concepts
- Spring Security — authentication layer