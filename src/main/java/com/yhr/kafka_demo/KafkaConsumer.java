package com.yhr.kafka_demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "kafka-demo-group")
    public void listen(String message) {
        log.info("Message received: " + message);
    }
}
