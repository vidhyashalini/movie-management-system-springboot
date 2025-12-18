# Movie Management System

A backend RESTful application developed using Spring Boot and Spring Data JPA to manage movie records efficiently with full CRUD operations.

---

## Features
- Create, Read, Update, and Delete movie records
- RESTful APIs for seamless frontend integration
- Input validation and exception handling
- MySQL database integration
- Scalable layered architecture

---

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- REST APIs
- MySQL
- Maven

---

## Project Architecture
- Controller Layer – Handles HTTP requests
- Service Layer – Business logic
- Repository Layer – Database operations using JPA
- Model Layer – Entity definitions

---
## Folder Structure
movie-management-system-springboot
│
├── src/main/java/com/example/moviemanagement
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   └── MovieManagementApplication.java
│
├── src/main/resources
│   ├── application.properties
│
├── pom.xml
├── README.md
└── .gitignore


## Configuration

### application.properties
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/moviedb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

