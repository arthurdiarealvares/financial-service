Financial Service
=================

![Under Construction](https://img.shields.io/badge/under%20construction-yes-orange?style=for-the-badge)
![Kotlin](https://img.shields.io/badge/Kotlin-Backend-7F52FF?style=for-the-badge&logo=kotlin)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-API-6DB33F?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-4169E1?style=for-the-badge&logo=postgresql)
![Docker](https://img.shields.io/badge/Docker-Containerized-2496ED?style=for-the-badge&logo=docker)

API responsible for handling order and payment events via webhooks, ensuring consistency even when events arrive out of order.

* * * * *

Stack
-----

-   Kotlin + Spring Boot
-   PostgreSQL
-   Docker

* * * * *

Running the project
-------------------

### 1\. Start dependencies

docker compose up -d

### 2\. Run application

./gradlew bootRun

* * * * *

Tests
-----

./gradlew test

* * * * *

API Documentation
-----------------

Swagger available at:

http://localhost:8080/swagger-ui/index.html

* * * * *

Notes
-----

-   Events may arrive out of order
-   The API ensures consistency between orders and payments
-   Idempotency is recommended
