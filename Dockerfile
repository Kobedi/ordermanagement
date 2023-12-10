FROM openjdk:17
MAINTAINER zadscience.com
COPY target/order-management-service-0.0.1.jar order-management-service-0.0.1.jar
ENTRYPOINT ["java","-jar","/order-management-service-0.0.1.jar"]