# spring-boot-jpa-custom-return-types

[![Java CI with Maven](https://github.com/hendisantika/spring-boot-jpa-custom-return-types/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/spring-boot-jpa-custom-return-types/actions/workflows/maven.yml)
![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.1-brightgreen?logo=springboot)
![Dependabot](https://img.shields.io/badge/Dependabot-enabled-blue?logo=dependabot)

Sample Spring Boot application showing the different return types supported by Spring Data JPA repositories.

    ✅ DTO Projections – Fetch only required fields for better performance.
    ✅ Interface-based Projections – Use lightweight projections without extra classes.
    ✅ Dynamic Projections – Choose return types at runtime.
    ✅ Streams – Efficiently handle large datasets.

### Tech Stack

- Java 25
- Spring Boot 4.1.1 (Web, Data JPA, DevTools)
- H2 in-memory database
- Lombok
- Maven (wrapper included)

### Prerequisites

- JDK 25 or newer
- No local Maven installation needed: use the bundled `./mvnw` wrapper

### Things to do list:

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-jpa-custom-return-types.git`
2. Navigate to the folder: `cd spring-boot-jpa-custom-return-types`
3. Run the application: `./mvnw clean spring-boot:run`
4. Open your favorite browser: http://localhost:8080/api/employees
5. Check the result and test on [custom_return_type.http](custom_return_type.http) file

To build and run the tests: `./mvnw clean package`

### API Endpoints

✅ Get All Employees (Entity)

GET http://localhost:8080/api/employees

✅ Get Employees as DTO

GET http://localhost:8080/api/employees/dto?department=IT

✅ Get Employees as Projection

GET http://localhost:8080/api/employees/projection?department=IT

✅ Get Employees as Stream

GET http://localhost:8080/api/employees/stream?department=IT

### H2 Console

The H2 console is enabled for debugging at http://localhost:8080/h2-console

- JDBC URL: `jdbc:h2:mem:testdb`
- Username / password: see `src/main/resources/application.properties`

### CI/CD & Dependency Management

- **GitHub Actions** ([maven.yml](.github/workflows/maven.yml)): builds and tests on JDK 25 (Temurin) on every push and pull
  request to `main`. Pushes to `main` also submit the Maven dependency graph to GitHub for better Dependabot alerts.
- **Dependabot** ([dependabot.yml](.github/dependabot.yml)): checks Maven and GitHub Actions daily at 05:00 (Asia/Jakarta).
  Updates are grouped (Spring, Maven plugins, minor/patch, GitHub Actions) to keep PRs manageable, and are labeled with
  conventional commit prefixes (`build(deps)`, `ci(deps)`).
