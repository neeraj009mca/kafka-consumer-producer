package com.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kafka.dto.UserDTO;
import com.kafka.service.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaProducerController {

    private KafkaProducer kafkaProducer;

    public KafkaProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody UserDTO user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Request sent to kafka topic="+user.toString());
    }
}