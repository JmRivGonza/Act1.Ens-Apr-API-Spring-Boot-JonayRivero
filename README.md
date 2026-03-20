# API REST — Gestor de Libros by Jonay Rivero Gonzalez (librosapp)
Proyecto desarrollado para la actividad Act1.Ens-Apr API Spring Boot. Consiste en una API REST completa para la gestión de un catálogo de libros, conectada a una base de datos MySQL y siguiendo una arquitectura de desarrollo
por capas.

## Estructura del Proyecto
El código está organizado siguiendo las mejores prácticas de Spring Boot, separando las responsabilidades en paquetes específicos:

 - `com.damw.librosapp.model`: Contiene la entidad Libro con sus anotaciones JPA (@Entity, @Table).

 - `com.damw.librosapp.repository`: Interfaz LibroRepository que hereda de JpaRepository para la persistencia de datos.

 - `com.damw.librosapp.service`: Clase LibroService que contiene la lógica de negocio (CRUD completo).

 - `com.damw.librosapp.controller`: LibroController que expone los endpoints bajo la ruta /api/v1/libros.

## Endpoints Implementados
Se han desarrollado los 5 métodos solicitados, verificados mediante pruebas en Postman:

 * GET /api/v1/libros: Listar toda la colección.

 * GET /api/v1/libros/{id}: Buscar un libro específico por su ID.

 * POST /api/v1/libros: Añadir un nuevo libro al catálogo.

 * PUT /api/v1/libros/{id}: Actualizar los datos de un libro existente.

 * DELETE /api/v1/libros/{id}: Eliminar un libro del sistema.

## Configuración de Base de Datos
La aplicación se conecta a una base de datos MySQL local llamada librosdb.
Configuración utilizada en application.properties:

 * URL: jdbc:mysql://localhost:3306/librosdb.

 * DDL-Auto: update (creación automática de tablas al arrancar).

## Evidencias de Funcionamiento
Se adjuntan capturas de pantalla de Postman que demuestran:

 * Creación exitosa de registros (POST).

 * Persistencia de datos en MySQL.

 * Respuestas correctas del servidor (200 OK, 204 No Content, 404 Not Found).
