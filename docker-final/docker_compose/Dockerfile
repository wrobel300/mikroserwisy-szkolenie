# budujemy z apline
FROM openjdk:8-jdk-alpine
# kopiowanie z target do obrazu
COPY ./boot/target/boot-0.0.1-SNAPSHOT.jar  /opt/app.jar
# uruchomienie jar'a, opcja dla szypszego startu Tomcata
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/app.jar"]
