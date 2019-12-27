FROM adoptopenjdk/openjdk8:latest
RUN mkdir /opt/app
ARG ARTIFACT
COPY target/${ARTIFACT} /opt/app/bird.jar
EXPOSE 8081
CMD ["java", "-jar", "/opt/app/bird.jar"]
