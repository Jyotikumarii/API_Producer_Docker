FROM openjdk:8
ADD target/api-final.jar api-final.jar
COPY target/api-final.jar api-final.jar
#EXPOSE 8080
ENTRYPOINT ["java", "-jar", "api-final.jar"]


