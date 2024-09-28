# Spring Boot REST API Application

This is a simple Spring Boot REST API application that allows you to manage entities. The API provides endpoints to create, read, update, and delete entities, as well as a health check endpoint.

## Table of Contents

- [Requirements](#requirements)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Entity Structure](#entity-structure)
- [License](#license)

## Requirements

- Java 8 or higher
- Maven 3.6.0 or higher

## Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Sandy-7061/Rest_Api.git
    ```

2. **Build the project**:
    ```bash
    mvn clean install
    ```

3. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

Alternatively, you can build a JAR file and run it:

```bash
mvn clean package
java -jar target/rest-api-application-0.0.1-SNAPSHOT.jar
```

## Running the Application

After running the application, the API will be accessible at `http://localhost:8080`.

## API Endpoints

### Entity Endpoints

1. **Get all entities**  
   `GET /entity`
   - **Description**: Retrieves all entities.
   - **Response**: A list of all entities.

2. **Create a new entity**  
   `POST /entity`
   - **Description**: Creates a new entity.
   - **Request Body**: JSON object representing the entity.
   - **Response**: `true` if the entity is created successfully.

3. **Get an entity by ID**  
   `GET /entity/id/{myid}`
   - **Description**: Retrieves an entity by its ID.
   - **Path Variable**: `myid` (Long) - The ID of the entity.
   - **Response**: The entity object.

4. **Update an entity by ID**  
   `PUT /entity/id/{id}`
   - **Description**: Updates an existing entity by its ID.
   - **Path Variable**: `id` (Long) - The ID of the entity to be updated.
   - **Request Body**: JSON object representing the updated entity.
   - **Response**: The updated entity object.

5. **Delete an entity by ID**  
   `DELETE /entity/id/{myid}`
   - **Description**: Deletes an entity by its ID.
   - **Path Variable**: `myid` (Long) - The ID of the entity to be deleted.
   - **Response**: The deleted entity object.

### Health Check Endpoint

1. **Health Check**  
   `GET /healthcheck`
   - **Description**: Checks the health of the application.
   - **Response**: `Ok` if the application is running properly.

## Entity Structure

The `Entity` class has the following attributes:

- `id` (String): The ID of the entity.
- `title` (String): The title of the entity.
- `name` (String): The name of the entity.

Example JSON for an Entity:

```json
{
  "id": "1",
  "title": "Sample Title",
  "name": "Sample Name"
}
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

You can customize the README further based on your project's specific details, like the repository URL and any additional setup steps.
