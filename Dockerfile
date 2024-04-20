FROM java:8-jdk-alpine
COPY ./target/spring_person-0.0.1-SNAPSHOT.jar /usr/app/spring-person-example/
WORKDIR /usr/app/spring-person-example/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring_person-0.0.1-SNAPSHOT.jar"]