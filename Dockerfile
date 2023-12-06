FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
COPY ./target/SpringBootWebFlux_Assign4_ZekunZhang-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","SpringBootWebFlux_Assign4_ZekunZhang-0.0.1-SNAPSHOT.jar"]