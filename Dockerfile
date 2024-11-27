FROM ubuntu:latest
LABEL authors="buharinasirahmad"

ENTRYPOINT ["top", "-b"]
# Use the official OpenJDK 23 image as the base image
FROM openjdk:23-jdk-slim

# Set the working directory
WORKDIR /schoolmanagementsystem

# Copy the JAR file from the build context (assuming you have built the JAR file)
#COPY target/school-management-system.jar app.jar

# Expose the application's port
EXPOSE 8080

## Run the application
#ENTRYPOINT ["java", "-jar", "app.jar"]
