FROM amazoncorretto:17
LABEL authors="torgammelgard"

WORKDIR /app

COPY build/libs/aws-starter-project-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]