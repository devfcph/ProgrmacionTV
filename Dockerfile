# Use a base image with Java 17 and Maven
FROM maven:3.8.3-openjdk-17 AS maven_builder

# Copia los archivos fuente y compila la aplicación
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn clean install

# Segunda etapa de la construcción de la imagen
FROM openjdk:17-jdk-alpine

# Establece variables de entorno para la base de datos
ENV DATABASE_URL=jdbc:mysql://localhost:3306/DBTelevisora
ENV DATABASE_USERNAME=root
ENV DATABASE_PASSWORD=d15rupt1ng
ENV DATABASE_PLATFORM=org.hibernate.dialect.MySQL57Dialect
ENV DATABASE_DRIVER=com.mysql.cj.jdbc.Driver

# Copia el JAR construido desde la etapa anterior
COPY --from=maven_builder /app/target/*.jar /app.jar

# Expone el puerto de la aplicación
EXPOSE 8090

# Ejecuta la aplicación al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "/app.jar"]
