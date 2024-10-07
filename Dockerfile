FROM amd64/eclipse-temurin:17.0.12_7-jdk
WORKDIR /app
COPY hellonebula17.jar /app/hellonebula17.jar 
ENTRYPOINT ["java","-jar","/app/hellonebula17.jar"]