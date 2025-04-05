FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/airline.jar airline.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "airline.jar"]