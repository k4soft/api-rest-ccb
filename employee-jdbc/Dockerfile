FROM openjdk:8
EXPOSE 9595
ADD ./target/persona-jdbc-0.0.1-SNAPSHOT.jar apijdbc.jar
ENTRYPOINT ["java","-jar","/apijdbc.jar"]