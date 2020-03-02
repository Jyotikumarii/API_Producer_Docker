FROM openjdk:8
ADD target/users-mysql.jar users-mysql.jar
#COPY target/api-final.jar api-final.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "users-mysql.jar"]


