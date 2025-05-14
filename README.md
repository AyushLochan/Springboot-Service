# Spring Boot Service

A RESTful API service built using Spring Boot, designed to handle basic CRUD operations with a focus on simplicity and scalability.

## 🛠️ Technologies Used

* Java 17+
* Spring Boot 2.x
* Maven for dependency management
* Spring Web
* Spring Data JPA
* H2 Database (in-memory)
* Spring Security (optional, for authentication)([YUMPU][2])

## 🚀 Features

* Create, Read, Update, Delete (CRUD) operations
* RESTful API endpoints
* In-memory H2 database for quick setup
* Optional Spring Security integration for user authentication
* Swagger UI for API documentation([Gist][3], [blog.techeazyconsulting.com][4])

## 📦 Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── service/
│   │               ├── controller/
│   │               ├── model/
│   │               ├── repository/
│   │               └── service/
│   └── resources/
│       ├── application.properties
│       └── static/
└── test/
    └── java/
        └── com/
            └── example/
                └── service/
                    └── ServiceApplicationTests.java
```



## ⚙️ Setup & Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/AyushLochan/Springboot-Service.git
   cd Springboot-Service
   ```



2. Build the project using Maven:

   ```bash
   ./mvnw clean install
   ```



3. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```



4. Access the API at:

   ```
   http://localhost:8080
   ```



5. Optional: Access Swagger UI at:

   ```
   http://localhost:8080/swagger-ui/
   ```



## 📄 API Endpoints

| Method | Endpoint        | Description             |                                               |
| ------ | --------------- | ----------------------- | --------------------------------------------- |
| GET    | /api/items      | Get all items           |                                               |
| GET    | /api/items/{id} | Get item by ID          |                                               |
| POST   | /api/items      | Create a new item       |                                               |
| PUT    | /api/items/{id} | Update an existing item |                                               |
| DELETE | /api/items/{id} | Delete an item          | ([blog.techeazyconsulting.com][4], [Gist][3]) |

*Replace `/api/items` with your specific resource path.*

## 🔐 Spring Security (Optional)

To enable basic authentication, add the following to your `application.properties`:

```properties
spring.security.user.name=user
spring.security.user.password=password
```



This will secure all endpoints with basic authentication.

## 🧪 Running Tests

To run the unit tests:

```bash
./mvnw test
```
