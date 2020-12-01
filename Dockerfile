FROM openjdk:11-jre
LABEL maintainer="BCP-DEMO-SPRINGBOOT"
ENV spring.application.name bootcamp-adventureworks-categories

COPY build/libs/bootcamp-adventureworks-categories-*SNAPSHOT.jar /opt/bootcamp-adventureworks-categories.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8","-jar","/opt/bootcamp-adventureworks-categories.jar"]