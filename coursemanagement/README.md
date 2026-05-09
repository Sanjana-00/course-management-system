# Online Learning Platform - Course Management Module

## Project Overview
This project is a Spring Boot REST API for managing courses in an online learning platform. It supports CRUD operations, filtering, sorting, validation, and PostgreSQL database integration.

---

## Features
- Create Course API
- Get All Courses API
- Get Course By ID API
- Update Course API
- Delete Course API
- Filter Courses by Category
- Sort Courses by Title or Description
- PostgreSQL Database Integration
- Input Validation using Spring Validation

---

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

---

## API Endpoints

### Create Course
POST `/api/courses`

### Get All Courses
GET `/api/courses`

### Get Course By ID
GET `/api/courses/{id}`

### Update Course
PUT `/api/courses/{id}`

### Delete Course
DELETE `/api/courses/{id}`

### Filter Courses by Category
GET `/api/courses/category/{category}`

### Sort Courses
GET `/api/courses?sortBy=title`

GET `/api/courses?sortBy=description`

---

## Database
Database Name:
`course_db`

---

## How to Run the Project

1. Clone the repository
2. Open project in IntelliJ IDEA
3. Configure PostgreSQL in `application.properties`
4. Run `CoursemanagementApplication.java`
5. Test APIs using Postman

---

## Sample JSON for Creating Course

```json
{
  "title": "Advanced Java",
  "description": "Java backend course",
  "instructorName": "Sanju",
  "difficultyLevel": "Intermediate",
  "category": "Programming"
}
```
