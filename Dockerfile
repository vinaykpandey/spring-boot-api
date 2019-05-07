ARG BASE_IMAGE=launcher.gcr.io/google/openjdk8
FROM ${BASE_IMAGE}
COPY target/gs-spring-boot-0.1.0.jar /app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java", "-jar", "/app.jar"] 
