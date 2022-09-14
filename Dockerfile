FROM openjdk:11
EXPOSE 80
ARG JAR_FILE=target/serviceclient-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
