FROM amazoncorretto:17
MAINTAINER tunombre_o_alias
COPY target/portfolio-BackEnd-0.0.1-SNAPSHOT.jar portfolio-BackEnd-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfolio-BackEnd-0.0.1-SNAPSHOT.jar"]