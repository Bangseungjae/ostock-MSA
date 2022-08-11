FROM openjdk:17-ea-jdk-slim
VOLUME /tmp
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar Eurekaserver.jar
ENTRYPOINT ["java","-jar","Eurekaserver.jar"]