# Product Services API

A Spring Boot application that provides RESTful APIs for managing products with basic CRUD operations and additional features like sorting and filtering.

## Technologies Used
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Java 17
- Swagger UI for API Documentation

## Features
- **CRUD Operations**: Complete Create, Read, Update, and Delete functionality for products
- **Sorting**: Products can be sorted by different parameters
- **Custom Queries**: Implementation of custom query methods
- **RESTful API Design**: Following REST principles
- **Swagger Documentation**: Interactive API documentation

## Project Structure
src/ ├── main/ │ 
            ├── java/ │ 
               │ └── com.bhavik.productServices
                        ├── controller
                                └── ProductController.java 
                        ├── model
                                └── Product.java 
                        ├── repository
                                 └── ProductRepository.java 
                        |└── service 
                                 └── ProductService.java
                        │ └── resources
                                 └── application.properties

## API Endpoints
- GET `/products` - Get all products
- GET `/products/{id}` - Get product by ID
- POST `/products` - Create a new product
- PUT `/products/{id}` - Update an existing product
- DELETE `/products/{id}` - Delete a product
- GET `/products/sort` - Get sorted products

## Installation & Setup
1. Clone the repository
bash git clone https://github.com/bhavikalalwani01/ProductServices.git

2. Navigate to project directory
bash cd ProductServices

3. Build the project
bash mvn clean install

4. Run the application
bash mvn spring-boot:run

## Usage
After starting the application, you can access:
- Application: `http://localhost:8080`
- Swagger UI: `http://localhost:8080/swagger-ui.html`

## API Examples

### Create Product
http POST /products { "name": "Sample Product", "price": 99.99, "quantity": 10 }

### Get Product
http GET /products/{id}

### Sort Products
http GET /products/sort?sortBy=price

## Configuration
The application uses H2 in-memory database with the following configuration:
properties spring.h2.console.enabled=true spring.datasource.url=jdbc:h2:mem:testdb

## Contributing
Contributions are welcome! Please feel free to submit a Pull Request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
