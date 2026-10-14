# clothing-store

Clothing store (Sklep odzieżowy) — individual project for the *Platformy programowania* course.
The app grows lab by lab: each lab adds one new topic on top of the previous state.

## Stack

- Java 21, Spring Boot 4, Maven (`./mvnw`)
- Spring MVC + Thymeleaf (server-side views)
- Data JPA, H2, PostgreSQL, Validation and Lombok are on the classpath for later labs
- Spring Security is commented out in `pom.xml` until the security lab

## Running

The system default JDK may be newer than Lombok supports, so run with JDK 21:

```
JAVA_HOME=/usr/lib/jvm/java-21-openjdk ./mvnw spring-boot:run
```

App: http://localhost:8080

Claude: do not start the app yourself — the user runs and checks it. Just list the URLs to open.

## Structure

```
src/main/java/pl/pp/clothingstore/
├── domain/        JavaBeans / model classes (Product, ...)
└── controllers/   Spring MVC controllers
src/main/resources/templates/   Thymeleaf views
```

## Conventions

- Code (classes, fields, methods, URLs, commits) in English.
- Text visible to the user in the UI in Polish (the course is in Polish).
- Keep it flat and simple: only what the current lab requires. No CSS frameworks,
  no JavaScript, no extra layers (service/repository) until a lab introduces them.
- Data lives in memory (lists in controllers) until the JPA lab.
- Domain classes are classic JavaBeans: `Serializable`, no-arg constructor,
  private fields, explicit getters/setters (no Lombok in `domain/` yet).

## Git

- `main` — stable, only merged releases.
- `develop` — all ongoing work.
- Commit per lab: `lab N: <short description>`.
- No `Co-Authored-By: Claude` or other Claude attribution in commits/PRs.

## Lab log

- Lab 1 — Spring Boot setup, controllers, Thymeleaf basics (done in the lab project).
- Lab 2 — JavaBean `Product`, selection expressions `*{}`, links `@{}`,
  product list table with `th:each`, empty-list message, Polish date/price formatting, Tak/Nie.
