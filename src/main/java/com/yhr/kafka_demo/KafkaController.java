package com.yhr.kafka_demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/kafka")
public class KafkaController {
    private  final KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public void publishMessage() {
        kafkaProducer.sendMessage("Hello World!");
    }
}
