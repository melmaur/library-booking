# Sprint 3 Review — Library Booking System

## Sprint Goal
Build a full stack booking system with REST API
and web frontend for managing library book reservations.

## Result
 Sprint Goal achieved — all 5 user stories completed.

## Demo — What was built

### Backend API
| Endpoint | Method | Status | Notes |
|---|---|---|---|
| /api/bookings | GET |  Done | Returns all bookings as JSON |
| /api/bookings | POST |  Done | Creates new booking from JSON body |
| /api/bookings/{id} | GET |  Done | Returns single booking by ID |
| /api/bookings/book/{title} | GET |  Done | Returns bookings by book title |
| /api/bookings/active | GET |  Done | Returns only active bookings |
| /api/bookings/{id}/cancel | PUT |  Done | Cancels booking, keeps history |
| /api/bookings/{id} | DELETE |  Done | Returns 204 No Content |

### Frontend
| Feature | Status | Notes                                      |
|---|---|--------------------------------------------|
| Booking form |  Done | Title, borrower, dates                     |
| Bookings table |  Done | Shows all bookings with status             |
| Active/Cancelled badges |  Done | Visual status indicator                    |
| Cancel button |  Done | Updates status via REST API                |
| Auto-refresh on action |  Done | Table reloads after create/cancel          |
| Separation of concerns |  Done | HTML, CSS and JS split into separate files |

## Velocity
- Story points committed: 12
- Story points delivered: 12
- Velocity: 100% 

## Feedback and Observations
- Full stack working end to end — browser to API to database
- Cancel keeps booking history — more realistic than delete
- Spring Boot serves static HTML with zero extra configuration
- JavaScript fetch() connects frontend to REST API cleanly
- All endpoints tested with Postman — screenshots on GitHub

## Next Steps
- Future Sprint: add Spring Security authentication
- Future Sprint: user login and role-based access control