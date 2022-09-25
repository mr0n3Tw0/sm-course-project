FROM adoptopenjdk/openjdk8:alpine-jre
ADD build/libs/dev-school-app-1.0-SNAPSHOT.jar /bserver/
WORKDIR /bserver/
ENV DATASOURCE_URL=jdbc:postgresql://localhost/devschool
ENV DATASOURCE_USERNAME=postgres
ENV DATASOURCE_PASSWORD=postgres

ENTRYPOINT ["java", "-jar", "dev-school-app-1.0-SNAPSHOT.jar"]