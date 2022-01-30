# Only a packing stage. JAR must be available
# Package stage
FROM openjdk:11.0.9.1-jre
WORKDIR /app

# Jar must be prebuild and not in target folder
COPY rest-server/target/rest-server-1.0.0-SNAPSHOT.jar rest-server.jar


# Cannot pass coommandline argument when using the JAR launcher

ENTRYPOINT [ "java", "-jar", "/app/rest-server.jar"]
EXPOSE 8080