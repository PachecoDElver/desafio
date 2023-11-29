# Proyecto de desafio
Este proyecto se realizo para demostrar mis habilidades para desarrollar una API que permita el registro usuarios

Pre-requisitos:
1. SpringTools
2. hsqldb-2.7.2
3. Java 8registro usuarios

Pasos para usar:
1. Cambiar la ruta de la BD en el properties del proyecto: spring.datasource.url=jdbc:hsqldb:file:<RUTA_PROYECTO_ALTURA_DE_SCRIPT>/BD/desafioDB
2. En caso no existir se debe ejecutar el script de la BD en hsqldb
3. Ejecutar el proyecto en SpringTools (run as/Spring Boot App)
4. En el directorio del proyecto se encuentra una coleccion de Postman, importarla. En ella se encuentran 2 request: La primera registra el usuario y la segunda lista los usuarios ya registrados. 
