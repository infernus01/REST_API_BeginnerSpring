# Spring Boot REST API

## Description

This project is a REST API built using Spring Boot. The API provides endpoints for managing and performing CRUD (Create, Read, Update, Delete) operations.

## Features

- RESTful endpoints for resource management
- CRUD operations
- Exception handling
- Input validation

## Installation

### Prerequisites

- Java 11 or higher
- Maven

### Steps

1. **Clone the repository:**

    ```bash
    git clone https://github.com/infernus01/REST_API_BeginnerSpring.git
    cd REST_API_BeginnerSpring
    ```

2. **Build the project:**

    ```bash
    mvn clean install
    ```

3. **Run the application:**

    ```bash
    java -jar target/your-app-name.jar
    ```
    Or,
    ```bash
    mvn spring-boot:run
    ```

## Usage

### Endpoints

- `GET /employees` - Retrieve all
- `GET /employees/{id}` - Retrieve a resource by ID
- `POST /employees` - Create a new resource
- `DELETE /employees/{id}` - Delete a resource

### Example Requests

- **GET** request to retrieve one or all:

    ```bash
    curl -X GET http://localhost:8080/employees
    curl -X GET http://localhost:8080/employees/{id}
    ```

- **POST** request to create a new resource:

    ```bash
    curl -X POST -H "Content-Type: application/json" -d '{"name": "New Resource"}' http://localhost:8080/employees
    ```

## Contribution

1. Fork the repository
2. Create a new branch (`git checkout -b feature/YourFeature`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add some feature'`)
5. Push to the branch (`git push origin feature/YourFeature`)
6. Open a Pull Request


