FROM openjdk:21

COPY build/libs/sigaplus-0.0.1-SNAPSHOT.jar /app/sigaplus.jar

WORKDIR /app

EXPOSE 8081

CMD ["java", "-jar", "sigaplus.jar", "--server.port=8081"]