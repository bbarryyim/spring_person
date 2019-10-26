# Pull base image.
FROM ubuntu:latest

RUN \
# Update
apt-get update -y && \
# Install Java
apt-get install default-jre -y

ADD ./target/spring_person-0.0.1-SNAPSHOT.jar spring-person-example.jar

EXPOSE 8080

CMD java -jar spring-person-example.jar