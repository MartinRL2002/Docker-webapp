FROM openjdk:11
COPY target/sb_docker_app.war /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-war","sb_docker_app.war"]