FROM openjdk:11

ADD ./target/rabbitmq-consumer3-0.0.1-SNAPSHOT.jar /usr/src/rabbitmq-consumer3-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

EXPOSE 9093

ENTRYPOINT ["java","-jar","rabbitmq-consumer3-0.0.1-SNAPSHOT.jar"]