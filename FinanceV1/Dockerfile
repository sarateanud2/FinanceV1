FROM openjdk:8
ADD target/Finance-Docker.jar finance-docker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "finance-docker.jar"]