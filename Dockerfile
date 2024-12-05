
FROM --platform=linux/x86_64 public.ecr.aws/amazoncorretto/amazoncorretto:17

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=build/libs/application.jar

ADD ${JAR_FILE} application.jar

ENTRYPOINT ["java","-jar","/application.jar"]
