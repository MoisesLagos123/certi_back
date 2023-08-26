# Al crear la base de datos se debe agregar los AI, CORREGIDO EN EL ARCHIVO SQL
# LAS CONSULTAS ESTAN EN EL MISMO ARCHIVO SQL AL FINAL DE LA POBLACION
# todo el flujo de usuario se encuentra comentado por tiempo no pude comentar el resto

# Certificación Talento Digital - Proyecto Java

Este repositorio contiene el código fuente de un proyecto Java desarrollado para la certificación de Talento Digital. El proyecto está basado en Spring Boot y utiliza varias dependencias para la persistencia de datos, la creación de servicios web y más.

## Requisitos Previos

Antes de comenzar, asegúrate de tener lo siguiente instalado en tu entorno de desarrollo:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) - Versión 17 recomendada.
- [Maven](https://maven.apache.org/download.cgi) - Herramienta de gestión de proyectos.
- [MySQL](https://dev.mysql.com/downloads/) - Base de datos relacional.

## Pasos para Ejecutar el Proyecto

1. **Clona el Repositorio:** Abre una terminal y ejecuta el siguiente comando para clonar este repositorio en tu máquina:

   ```bash
   git clone https://github.com/TuUsuario/certi_back.git

#Configura la Base de Datos: Crea una base de datos en MySQL y configura las credenciales en el archivo src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/nombre_de_tu_base_de_datos
spring.datasource.username=usuario_de_mysql
spring.datasource.password=contraseña_de_mysql

#Compila el Proyecto: Navega hasta la carpeta del proyecto y ejecuta el siguiente comando para compilar el proyecto:
mvn clean install
#Ejecuta la Aplicación: Ejecuta el siguiente comando para iniciar la aplicación:
mvn spring-boot:run

La aplicación se ejecutará en http://localhost:4000.
