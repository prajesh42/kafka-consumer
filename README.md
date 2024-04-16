# kafka-consumer
Sample project to setup kafka as a consumer

# Kafka Consumer Implementation

## Description

This project is an implementation of a Kafka consumer using Java 17. It utilizes the Spring Kafka framework for interacting with Apache Kafka.

## Dependencies

- **spring-kafka**: This dependency provides the necessary components for integrating Kafka with Spring applications.

## Implementation Details

### Kafka Listener

A Kafka listener has been added to consume messages from the "kafka-auto-topic" topic. The consumer group ID is set to "kafkatest1".

```java
@KafkaListener(topics = "kafka-auto-topic", groupId = "kafkatest1")
public void consume(String message) {
    log.info("Consumer consumed the message: {}", message);
}
```
# Application Configuration
The following properties have been added to the `application.yml` file:

```yml
spring:
  kafka:
    consumer:
      bootstrap-servers: localhost:9092
      group-id: kafkatest1
      
server:
  port: 9192
```

