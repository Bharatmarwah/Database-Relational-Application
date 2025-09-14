# DatabaseRelationalApplication

A Spring Boot RESTful API application demonstrating **relational database management** using **JPA/Hibernate** with PostgreSQL. The application manages **Users, Orders, Roles**, and **Laptop & Address** details for each user.

---

## Features

- **User Management**
  - Each user can have multiple orders.
  - Each user can have multiple roles (Many-to-Many relationship).

- **Order Management**
  - Users can have multiple orders.
  - Orders are linked to a specific user.

- **Role Management**
  - Roles are reusable across multiple users (Many-to-Many).
  - Examples: `Admin`, `User`, `Manager`.

- **Embedded Entities**
  - Users have embedded `Laptop` information.
  - Users have `Address` linked via One-to-One relationship.

- **Database**
  - PostgreSQL used as the relational database.
  - Entities automatically mapped to tables using JPA annotations.

---

## Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Jackson (JSON Serialization/Deserialization)

---

## Entity Relationships

- **User ↔ Orders**: One-to-Many
- **User ↔ Roles**: Many-to-Many
- **User ↔ Address**: One-to-One
- **User ↔ Laptop**: Embedded

---
