FROM openjdk:17-jdk-slim

ADD target/spring-boot-maven-plugin.jar spring-boot-maven-plugin.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "spring-boot-maven-plugin.jar"]
