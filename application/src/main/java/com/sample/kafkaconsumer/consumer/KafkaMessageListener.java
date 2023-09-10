package com.sample.kafkaconsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

	Logger log= LoggerFactory.getLogger(KafkaMessageListener.class);
	
	@KafkaListener(topics = "kafka-test", groupId = "kafkatest1")
	public void consume(String message) {
		log.info("consumer consume the message {} ",message);
	}
}
