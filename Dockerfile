FROM openjdk:17-oracle
WORKDIR ContDir
COPY target/Spring-Boot-Testing-CI-CD-0.0.1-SNAPSHOT.jar /ContDir/Spring-CI-CD.jar
CMD ["java","-jar","Spring-CI-CD.jar"]
