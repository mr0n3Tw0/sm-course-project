FROM adoptopenjdk/openjdk8:alpine-jre
ADD devschool-front-app-server/build/libs/devschool-front-app-server-1.0.0.jar /fserver/
WORKDIR /fserver/
EXPOSE 8081:8081
ENV PORT 8081
ENV BACKEND_PORT 8080
ENV HOST localhost
ENV SCHEMA http
ENTRYPOINT java -jar devschool-front-app-server-1.0.0.jar -port=$PORT -P:ktor.backend.port=$BACKEND_PORT -P:ktor.backend.host=$HOST -P:ktor.backend.schema=$SCHEMA
