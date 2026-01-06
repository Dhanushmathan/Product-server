FROM eclipse-temurin:17-jre-alpine
COPY target/*.jar demo.jar
EXPOSE 5050
CMD [ "java","-jar","demo.jar" ]