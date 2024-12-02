
# Use openjdk:17-slim as the base image
FROM openjdk:17-slim
FROM maven:3.8.3-openjdk-17 

# Set the working directory in the container
WORKDIR /app

COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests



# Expose the port for the Spring Boot application
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "target/DSIbrahimGaha-0.0.1-SNAPSHOT.jar"]
