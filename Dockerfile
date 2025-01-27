# Use the official Tomcat base image
FROM tomcat:10.1-jdk17

# Copy the WAR file to the Tomcat webapps directory
COPY target/demo-app-1.0.war /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]