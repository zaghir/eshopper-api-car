FROM java:8
EXPOSE 8000
ADD target/api-car-0.0.1-SNAPSHOT.jar api-car-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","api-car-0.0.1-SNAPSHOT.jar"]
