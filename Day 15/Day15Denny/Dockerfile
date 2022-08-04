#ARG CRD
FROM openjdk:11
EXPOSE 8080
COPY target/student.jar student.jar
ENTRYPOINT ["java","-jar","/student.jar"]