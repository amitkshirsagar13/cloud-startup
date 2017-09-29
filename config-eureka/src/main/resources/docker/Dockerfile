# Base Alpine Linux based image with OpenJDK JRE only
FROM openjdk:8-jre-alpine
# copy application WAR (with libraries inside)
COPY config-eureka-0.0.1-SNAPSHOT.jar /app.jar

# specify default command
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=test", "/app.jar"]

ENV VPORT=8761
ENV VEUREKAUSER=eurekaconfig
ENV VEUREKAPASSWD=eurekapasswd
ENV VGITCONFIGURL=https://github.com/amitkshirsagar13/spring-config.git

EXPOSE 8761