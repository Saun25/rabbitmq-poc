FROM openjdk:11

ADD ./target/rabbitmq-consumer2-0.0.1-SNAPSHOT.jar /usr/src/rabbitmq-consumer2-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

EXPOSE 9092

ENTRYPOINT ["java","-jar","rabbitmq-consumer2-0.0.1-SNAPSHOT.jar"]