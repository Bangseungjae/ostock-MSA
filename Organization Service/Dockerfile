FROM openjdk:17-ea-jdk-slim
VOLUME /tmp
COPY target/organization-service-0.0.1-SNAPSHOT.jar Organization-service.jar
ENTRYPOINT ["java","-jar","Organization-service.jar"]