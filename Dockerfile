FROM tomcat:10.1-jre11
COPY target/sb_docker_app.war /usr/local/tomcat/webapps/My-Docker-WebApp.war
EXPOSE 8080
