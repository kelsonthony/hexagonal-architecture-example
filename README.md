# Hexagonal Architecture Example

This project demonstrates the implementation of the Hexagonal Architecture (also known as Ports and Adapters pattern) in a Java-based application. It aims to create a loosely coupled architecture that separates the core logic of the application from external concerns like databases, web interfaces, or other communication protocols.

## Key Technologies

- **Java**: The primary programming language used for developing the application.
- **Spring Boot**: Simplifies the development of new Spring applications through convention over configuration. It's used for dependency injection, web layer, and data access configurations.
- **Maven**: A build automation tool used for managing project's build, reporting, and documentation from a central piece of information.
- **SQL**: Structured Query Language used for managing and manipulating the relational database.

## Hexagonal Architecture Overview

Hexagonal Architecture divides the application into inside and outside parts. The inside part consists of the application's business logic, while the outside part interacts with external agents like databases, web clients, or other services.

### Components

- **Domain Model**: Represents the business logic and business rules of the application.
- **Ports**: Interfaces that define the contract for the application's core logic to communicate with external agents.
    - **Inbound Ports**: Used by external agents to send commands or queries to the application (e.g., `UserService`).
    - **Outbound Ports**: Used by the application to communicate with external resources (e.g., `UserRepository`).
- **Adapters**: Implementations of the ports that translate between the external world and the application's core logic.
    - **Primary/Driving Adapters**: Interact with the application through inbound ports (e.g., REST controllers).
    - **Secondary/Driven Adapters**: Implement outbound ports to interact with external agents like databases (e.g., `JpaUserRepository`).

## Project Structure

- `src/main/java/com/kelsonthony/hexagonalarchitecture/hexagonalarchitectureexample/domain`: Contains the core business logic and models.
- `src/main/java/com/kelsonthony/hexagonalarchitecture/hexagonalarchitectureexample/domain/port/in`: Defines inbound ports.
- `src/main/java/com/kelsonthony/hexagonalarchitecture/hexagonalarchitectureexample/domain/port/out`: Defines outbound ports.
- `src/main/java/com/kelsonthony/hexagonalarchitecture/hexagonalarchitectureexample/infrastructure/adapter/out`: Contains implementations of outbound ports (secondary adapters).
- `src/main/java/com/kelsonthony/hexagonalarchitecture/hexagonalarchitectureexample/application/service`: Implements the inbound ports (primary adapters) and contains application services.

## Running the Application

Ensure you have Java and Maven installed. Clone the repository, navigate to the project directory, and run:

```bash
mvn spring-boot:run