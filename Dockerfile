FROM openjdk:8-jdk-alpine
COPY build/libs/*.jar rewardsCentral.jar
ENTRYPOINT ["java","-jar","/rewardsCentral.jar"]