FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/prova-demo.jar /app/app.jar/

ENTRYPOINT ["java","-jar","/app/app.jar"]