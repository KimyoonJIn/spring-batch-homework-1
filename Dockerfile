FROM openjdk:8-jdk-alpine
ADD target/spring-batch-csv-to-mysql-security.jar spring-batch-csv-to-mysql-security.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","spring-batch-csv-to-mysql-security.jar"]
