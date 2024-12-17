FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY build/libs/accountmanagementMS.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
