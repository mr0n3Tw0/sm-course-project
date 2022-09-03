FROM adoptopenjdk/openjdk8:alpine-jre
ARG JAR_FILE=build/libs/dev-school-app-1.0-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar  
ENTRYPOINT ["java","-jar","app.jar"]  
