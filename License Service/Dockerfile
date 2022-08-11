FROM openjdk:17-ea-jdk-slim
VOLUME /tmp
COPY target/licensing-service-0.0.3-SNAPSHOT.jar Licensing-service.jar
ENTRYPOINT ["java","-jar","Licensing-service.jar"]