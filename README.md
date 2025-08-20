# Challange-foro-hub
ste repositorio contiene la resolución del Challenge - Foro Alura, desarrollado con Spring Boot para la creación de la API Rest, MySQL como sistema de bases de datos y Java 17 como lenguaje principal.
Se trabajó con IntelliJ IDEA como IDE y Insomnia para la prueba de los endpoints.
Este proyecto corresponde al cuarto reto de la formación Oracle Next Education (ONE) de Oracle + Alura LATAM.

El reto consiste en implementar una API siguiendo las mejores prácticas del modelo REST, incluyendo validaciones y persistencia de datos en una base de datos relacional.

📖 Historia

El Foro Alura es un espacio donde los estudiantes de la plataforma pueden formular preguntas relacionadas con los cursos.
Allí interactúan alumnos, profesores y moderadores en un ambiente de aprendizaje colaborativo.

Este proyecto busca replicar el funcionamiento del foro a nivel de Back End, permitiendo gestionar tópicos y sus relaciones con usuarios y respuestas.
Para ello, se desarrolló una API Rest con Spring Boot, enfocada en la gestión de los tópicos.

🔨 Funcionalidades

La API permite:

Crear un nuevo tópico.

Mostrar todos los tópicos creados.

Consultar un tópico específico.

Actualizar un tópico.

Eliminar un tópico.

Definir rutas siguiendo las mejores prácticas de REST.

Realizar validaciones basadas en reglas de negocio.

Implementar persistencia en base de datos con MySQL.

🚀 Comenzando

Estas instrucciones permiten obtener una copia del proyecto en tu máquina local para propósitos de desarrollo y pruebas.

Consulta la sección de Deployment para conocer cómo desplegar el proyecto.

📋 Pre-requisitos

Para ejecutar el proyecto necesitas:

Java 17

MySQL instalado y configurado

IntelliJ IDEA (o cualquier IDE de tu preferencia)

Maven (gestor de dependencias)

🔧 Instalación

Clonar el repositorio:

git clone https://github.com/tu-repositorio.git


Configurar la base de datos en application.properties.

Ejecutar las migraciones (si aplican).

Iniciar el proyecto desde tu IDE o con:

mvn spring-boot:run


Probar los endpoints con Insomnia o Postman.

🛠️ Construido con

Spring Boot - Framework para el desarrollo de aplicaciones web y microservicios.

Java 17 - Lenguaje de programación principal.

MySQL - Sistema de gestión de bases de datos.

IntelliJ IDEA - Entorno de desarrollo integrado.

Trello - Herramienta de gestión de tareas y proyectos.
