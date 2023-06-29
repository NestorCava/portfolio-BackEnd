FROM amazoncorretto:17
MAINTAINER tunombre_o_alias
COPY target/NAME-YOUR-FILE-BUILD-SPRINGBOOT.jar NAME-YOUR-FILE-BUILD-SPRINGBOOT.jar
ENTRYPOINT ["java","-jar","/portfolio-BackEnd-0.0.1-SNAPSHOT.jar"]