FROM openjdk:17-ea-jdk-slim
VOLUME /tmp
COPY target/gatewayserver-0.0.1-SNAPSHOT.jar Gatewayserver.jar
ENTRYPOINT ["java","-jar","Gatewayserver.jar"]