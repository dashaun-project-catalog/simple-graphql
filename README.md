 [![Forks][forks-shield]][forks-url]
 [![Stargazers][stars-shield]][stars-url]
 [![Issues][issues-shield]][issues-url]
 
# Spring for GraphQL

This is a project will demonstrate the basics of building a GraphQL API using Spring for GraphQL. This
project is built on Spring Boot 3.2 and Java 21.

## About the Application

- This application is built around the domain model of a `Coffee` type.
- There is a `CoffeeService` responsible for creating an in-memory collection of
  coffees and the CRUD operations to support it.
- The `CoffeeController` is responsible for mapping methods to the GraphQL Schema.
- The GraphQL Schema is located at `/src/main/resources/graphql/schema.graphqls`.
- The GraphiQL UI has been enabled in `application.yaml`

## Quick Start

```bash
./mvnw spring-boot:run
```

 <!-- MARKDOWN LINKS & IMAGES -->
 <!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
 [forks-shield]: https://img.shields.io/github/forks/dashaun-project-catalog/simple-graphql.svg?style=for-the-badge
 [forks-url]: https://github.com/dashaun-project-catalog/simple-graphql/forks
 [stars-shield]: https://img.shields.io/github/stars/dashaun-project-catalog/simple-graphql.svg?style=for-the-badge
 [stars-url]: https://github.com/dashaun-project-catalog/simple-graphql/stargazers
 [issues-shield]: https://img.shields.io/github/issues/dashaun-project-catalog/simple-graphql.svg?style=for-the-badge
 [issues-url]: https://github.com/dashaun-project-catalog/simple-graphql/issues