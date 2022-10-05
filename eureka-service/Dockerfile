FROM openjdk:17-alpine
RUN addgroup -S demo-group && adduser -S demo-user -G demo-group
USER demo-user:demo-group
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
