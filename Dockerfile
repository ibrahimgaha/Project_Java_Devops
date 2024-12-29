# Use Maven for building the project and OpenJDK for running it
FROM maven:3.8.3-openjdk-17 AS builder

# Set the working directory for the build
WORKDIR /app

# Copy project files to the container
COPY pom.xml .
COPY src ./src

# Build the project
RUN mvn clean package -DskipTests

# Runtime image for the application
FROM openjdk:17-slim

# Set the working directory
WORKDIR /app

# Copy the built jar file from the builder stage
COPY --from=builder /app/target/DSIbrahimGaha-0.0.1-SNAPSHOT.jar app.jar

# Expose the port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
