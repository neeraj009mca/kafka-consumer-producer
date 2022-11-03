package com.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.constant.AppConstants;
import com.kafka.dto.UserDTO;

@Service
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(UserDTO user){
        LOGGER.info(String.format("Message sent -> %s", user.toString()));
        kafkaTemplate.send(AppConstants.TOPIC_NAME,  user.toString());
    }
}