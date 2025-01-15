FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY build/libs/accountmanagementMS.jar accountms.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "accountms.jar"]
