# Employee Management System

A simple **Spring Boot CRUD application** to manage employees. This project demonstrates the use of **Spring Boot**, **Spring Data JPA**, **H2 database**, and **RESTful APIs**. It's designed as a resume-ready project for freshers.

---

## **Technologies Used**
- Java 21
- Spring Boot 3.5.5
- Spring Data JPA
- H2 Database (In-memory)
- Maven
- Postman (for testing APIs)

---

## **Project Structure**
crudapp
├── src/main/java/com/example/crudapp
│ ├── controller/EmployeeController.java
│ ├── model/Employee.java
│ ├── repository/EmployeeRepository.java
│ └── service/EmployeeService.java
├── src/main/resources/application.properties
├── pom.xml
└── README.md

---

## **Features**
- Add a new employee (`POST /employees/add`)
- View all employees (`GET /employees/all`)
- View an employee by ID (`GET /employees/{id}`)
- Update an employee (`PUT /employees/update/{id}`)
- Delete an employee by ID (`DELETE /employees/delete/{id}`)
- Delete all employees (`DELETE /employees/delete/all`)

---
