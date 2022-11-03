package com.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaApp {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(KafkaApp.class, args);
    }

}
