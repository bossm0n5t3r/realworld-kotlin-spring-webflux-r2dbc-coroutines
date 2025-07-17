# ![RealWorld Example App](logo.png)

> ### Kotlin + Spring WebFlux + R2DBC + Coroutines codebase containing real world examples (CRUD, auth, advanced patterns, etc) that adheres to the [RealWorld](https://github.com/gothinkster/realworld) spec and API.

### [Demo](https://demo.realworld.build/)&nbsp;&nbsp;&nbsp;&nbsp;[RealWorld](https://github.com/gothinkster/realworld)

This codebase was created to demonstrate a fully fledged fullstack application built with **Kotlin, Spring WebFlux,
R2DBC, and Coroutines** including CRUD operations, authentication, routing, pagination, and more.

We've gone to great lengths to adhere to the **Spring Boot and Kotlin** community styleguide & best practices.

For more information on how this works with other frontends/backends, head over to
the [RealWorld](https://github.com/gothinkster/realworld) repo.

# How it works

This is a reactive backend implementation of the RealWorld specification using:

- **Kotlin** as the programming language
- **Spring Boot 3.5.3** as the application framework
- **Spring WebFlux** for reactive web endpoints
- **Spring Data R2DBC** for reactive database access
- **Kotlin Coroutines** for asynchronous programming
- **Spring Security** for authentication and authorization
- **Spring Data Reactive Redis** for caching
- **Spring Cloud Stream** for event streaming
- **Sentry** for error tracking
- **Testcontainers** for integration testing
- **Docker Compose** for local development

The application follows a reactive programming model throughout the stack, from the web layer down to the database
access layer, providing non-blocking, asynchronous execution.

# Getting started

## Prerequisites

- JDK 17 or later
- Docker and Docker Compose

## Running the application

1. Clone the repository:
   ```
   git clone https://github.com/bossm0n5t3r/realworld-kotlin-spring-webflux-r2dbc-coroutines.git
   cd realworld-kotlin-spring-webflux-r2dbc-coroutines
   ```

2. Run the application with Docker Compose:
   ```
   ./gradlew clean bootRun
   ```

   This will automatically start the required services (PostgreSQL, Redis) using Docker Compose.

3. The API will be available at `http://localhost:8080/api`

## Running tests

```
./gradlew test
```

## Building for production

```
./gradlew build
```

# API Documentation

The API adheres to the [RealWorld API spec](https://github.com/gothinkster/realworld/tree/master/api).

# Contributing

Please read the [RealWorld guidelines](https://github.com/gothinkster/realworld/blob/master/CONTRIBUTING.md) for
contributing.

# License

This project is open source and available under the [MIT License](LICENSE).
