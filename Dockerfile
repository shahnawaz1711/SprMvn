FROM openjdk:17
ARG myJar=target/sprmvn.jar
ADD ${myJar} sprmvn.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "sprmvn.jar" ]