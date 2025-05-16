#FROM openjdk:21-oracle
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#EXPOSE 9056


FROM openjdk:21-oracle
EXPOSE 8072
ADD target/spring.jar spring.jar
ENTRYPOINT ["java", "-jar", "/spring.jar"]