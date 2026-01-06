FROM maven:3.9.6-eclipse-temurin-17 AS build
COPY pom.xml .
COPY src src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
COPY target/*.jar demo.jar
EXPOSE 5050
CMD [ "java","-jar","demo.jar" ]