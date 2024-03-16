FROM gradle:8.6-jdk-alpine AS build

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src

RUN gradle build --no-daemon

FROM openjdk:17-alpine3.14

COPY --from=build /home/gradle/src/build/libs/*.jar /app/hackathon-grupo29-0.0.1-SNAPSHOT-plain.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/hackathon-grupo29-0.0.1-SNAPSHOT-plain.jar"]