FROM amazoncorretto:17
LABEL authors="torgammelgard"

WORKDIR /app

COPY build.gradle settings.gradle /app/
COPY src /app/src
COPY gradlew /app/gradlew
COPY gradle /app/gradle

RUN chmod +x ./gradlew

RUN ./gradlew clean build -x test

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/build/libs/backend-0.0.1-SNAPSHOT.jar"]