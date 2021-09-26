FROM openjdk:11
ADD target/spring_docker_kitchen.jar spring_docker_kitchen.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring_docker_kitchen.jar"]