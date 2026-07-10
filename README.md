# User Management API - Spring Boot Backend

Este proyecto consiste en una API REST para la gestión y consulta de usuarios, desarrollada bajo una arquitectura limpia en capas utilizando **Java 17** y **Spring Boot 3**. La aplicación expone servicios para buscar información de usuarios a través de filtros específicos y retorna estructuras de datos optimizadas sin exponer el modelo directo de la base de datos.

## 🚀 Características Clave

*   **Arquitectura en Capas:** Separación limpia de responsabilidades (Controller, Service, Repository, Entity, DTO y Mapper).
*   **Data Transfer Objects (DTO):** Implementación de **Records de Java** para garantizar la inmutabilidad de los datos transferidos hacia el cliente.
*   **Manejo Global de Excepciones:** Centralización de errores mediante un `@ControllerAdvice` que retorna respuestas HTTP semánticas y estructuradas en formato JSON (`404 Not Found`, `400 Bad Request`, etc.).
*   **Control de Palabras Reservadas en BD:** Configuración avanzada de mapeo con Hibernate para el manejo seguro de tablas con nombres críticos (como la entidad `user` mapeada de forma segura mediante escapes en PostgreSQL).
*   **Consultas Optimorizadas:** Uso eficiente de Query Methods automáticos provistos por Spring Data JPA.

## 🛠️ Tecnologías y Herramientas

*   **Java 17** (LTS)
*   **Spring Boot 3.x**
*   **Spring Data JPA**
*   **PostgreSQL** (Motor de Base de Datos Relacional)
*   **Maven** (Gestor de Dependencias)
*   **Postman** (Pruebas de Endpoint)

## 📁 Estructura del Proyecto Principal

```text
src/main/java/com/project/Llanos
│
├── controller/          # Capa de exposición de endpoints REST
├── dto/                 # Estructuras de datos inmutables (Java Records)
├── entity/              # Modelos de persistencia (Mapeo de Hibernate/JPA)
├── exception/           # Excepciones personalizadas y Manejador Global
├── mapper/              # Clases de utilidad para conversión de Entidades a DTOs
└── repository/          # Interfaces de acceso a datos (Spring Data JPA)
