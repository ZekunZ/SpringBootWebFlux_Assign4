FROM eclipse-temurin:17-jdk-focal
EXPOSE 8080
ADD target/SpringBootWebFlux_Assign4_ZekunZhang-0.0.1-SNAPSHOT.jar SpringBootWebFlux_Assign4_ZekunZhang-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringBootWebFlux_Assign4_ZekunZhang-0.0.1-SNAPSHOT.jar"]