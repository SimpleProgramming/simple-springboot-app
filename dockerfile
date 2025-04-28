FROM openjdk:11-jre-slim
COPY ./simple-springboot-app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
