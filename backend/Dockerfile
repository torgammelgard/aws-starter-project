FROM gradle:jdk17 AS buildstage
WORKDIR /usr/app/
COPY . .
RUN gradle build

FROM amazoncorretto:17
LABEL authors="torgammelgard"

WORKDIR /app

COPY --from=buildstage /usr/app/ .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/build/libs/backend-0.0.1-SNAPSHOT.jar"]
