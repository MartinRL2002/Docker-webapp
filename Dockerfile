FROM openjdk:11
COPY target/sb_docker_app.war user/app/
WORKDIR /user/app
EXPOSE 8080
ENTRYPOINT ["java","-war","sb_docker_app.war"]
