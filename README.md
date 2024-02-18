# Basic Spring for GraphQL Application

This is a project for the [Spring CLI](https://spring-projects-experimental.github.io/spring-cli/spring-cli/index.html) 
that will demonstrate the basics of building a GraphQL API using Spring for GraphQL. This
project is built on Spring Boot 3.1.0 and Java 17.

## About the Application

- This application is built around the domain model of a `Coffee` type. You will find
a `Coffee` record and `Size` enum in the `model` package. 
- There is a `CoffeeService` 
in the `service` package that is responsible for creating an in-memory collection of 
coffees and the CRUD operations to support it. 
- The `CoffeeController` is responsible for mapping methods to the GraphQL Schema.
- The GraphQL Schema is located at `/src/main/resources/graphql/schema.graphqls`.
- The GraphiQL UI has beenc enabled in `application.properties`

## Running the Application

To execute the tests run the following command: 

```
./mvnw clean package
```

## Improving the application

If there is anything that you would like to see in this base application please let me 
know or feel free to send me a PR. 