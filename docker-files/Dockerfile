# Pull base image.
# FROM fiadliel/java8-jre
FROM thetallgrassnet/alpine-java
MAINTAINER Vitaly Mayatnikov <mayatnikov@gmail.com>
ENV APPNAME "Test spring-boot application"
ENV APPHOME "/opt/app"

# Define working directory.
WORKDIR /data
ADD ./app1.jar $APPHOME/app1.jar
EXPOSE 8888
CMD ["java","-jar","/opt/app/app1.jar"]