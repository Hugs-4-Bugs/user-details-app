Here's an updated `README.md` file with detailed, streamlined instructions for cloning, setting up, and running your *User Details App*. This version includes sections for each command in a clear and attractive layout.

```markdown
# User Details App

Welcome to the User Details App! This Spring Boot application allows users to manage basic user information, including adding, viewing, and deleting entries. The app provides a straightforward CRUD (Create, Read, Update, Delete) interface with data validation and easy-to-use endpoints.

## Repository Link
[https://github.com/Hugs-4-Bugs/user-details-app.git](https://github.com/Hugs-4-Bugs/user-details-app.git)

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features
- Add, view, update, and delete user details.
- Basic validation for user information fields (First Name, Last Name, Phone Number, Email, and Address).
- Clean and intuitive REST API with CRUD operations.

## Tech Stack
- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **Build Tool:** Maven
- **IDE (optional):** IntelliJ IDEA, Eclipse, or any preferred Java IDE

## Prerequisites
Ensure the following are installed on your system:
- **Java 11** or higher
- **MySQL**
- **Maven**

## Installation

### Step 1: Clone the Repository
To get started, clone the repository to your local machine:
```bash
git clone https://github.com/Hugs-4-Bugs/user-details-app.git
cd user-details-app
```

### Step 2: Configure the Database
1. Open the `src/main/resources/application.properties` file.
2. Update the following properties with your MySQL credentials:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/userdetailsdb
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

### Step 3: Install Dependencies
Navigate to the project root and install dependencies using Maven:
```bash
mvn clean install
```

## Running the Application

Once setup is complete, you can start the application:

```bash
mvn spring-boot:run
```

The application will start running at [http://localhost:8080](http://localhost:8080).

## Usage

With the app running, use the following endpoints to manage user details.

### API Endpoints

| Method | Endpoint         | Description              |
|--------|-------------------|--------------------------|
| GET    | `/api/users`     | Retrieve all users       |
| GET    | `/api/users/{id}`| Retrieve a user by ID    |
| POST   | `/api/users`     | Add a new user           |
| PUT    | `/api/users/{id}`| Update an existing user  |
| DELETE | `/api/users/{id}`| Delete a user by ID      |

**Sample Request Payload (JSON):**
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "phoneNumber": "1234567890",
  "email": "john.doe@example.com",
  "address": "123 Main Street, City, Country"
}
```

### Example cURL Commands
- **Add a User:**
  ```bash
  curl -X POST -H "Content-Type: application/json" -d '{"firstName":"John", "lastName":"Doe", "phoneNumber":"1234567890", "email":"john.doe@example.com", "address":"123 Main Street, City, Country"}' http://localhost:8080/api/users
  ```

- **Retrieve All Users:**
  ```bash
  curl -X GET http://localhost:8080/api/users
  ```

- **Update a User:**
  ```bash
  curl -X PUT -H "Content-Type: application/json" -d '{"firstName":"Jane", "lastName":"Doe", "phoneNumber":"0987654321", "email":"jane.doe@example.com", "address":"456 Another St, City, Country"}' http://localhost:8080/api/users/{id}
  ```

- **Delete a User:**
  ```bash
  curl -X DELETE http://localhost:8080/api/users/{id}
  ```

## Contributing
Feel free to fork the repository, submit pull requests, or open issues for suggestions and improvements!

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```

This README offers a structured and straightforward guide to set up, run, and use your *User Details App*, with easy-to-follow sections and commands.
