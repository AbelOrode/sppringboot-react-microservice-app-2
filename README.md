## A microservice application titled Course Management System  built on Spring WebFlux, and React.js.
-- Each of the services would be implemented using three different databases which are postgreSQL, H2 in-memory DB, and MYSQL.
-- This application, being the second out of the three microservices, would be implemented using H2 in-memory database.

## Save Purchase - Endpoint

```
POST /api/purchase/ HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json


{
    "userId" : 3,
    "courseId" : 3,
    "title" : "course-3",
    "price" : 50.7
}
```

## Get All Purchases of user by Id - Endpoint

```
GET /api/purchase/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json

{
    "userId" : 2,
    "courseId" : 2,
    "title" : "course-2",
    "price" : 45.7
}
```