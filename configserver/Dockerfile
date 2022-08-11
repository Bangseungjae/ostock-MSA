FROM openjdk:17-ea-jdk-slim
VOLUME /tmp
COPY target/configserver-0.0.1-SNAPSHOT.jar Configserver.jar
ENTRYPOINT ["java","-jar","Configserver.jar"]