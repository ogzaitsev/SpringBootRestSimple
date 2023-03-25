# SpringBootRestSimple
A simple Spring Boot RESTful application
## Description
This application provides REST API for managing employees database
Database is runned by PostgreSQL

### CRUD operations
* To *get all* employees, access URL http://localhost:8080/employeesapi/ - use **GET** http method
* To *get by ID*, access URL http://localhost:8080/employeesapi/get/ **{id_number}** - **GET** http method
* To *add new* employee, access http://localhost:8080/employeesapi/ using **POST** http method
* To *update* employee, access http://localhost:8080/employeesapi/ using **PUT** http method
* To *delete* employee by ID, access http://localhost:8080/employeesapi/delete/ **{id_number}** using **DELETE** http method.
