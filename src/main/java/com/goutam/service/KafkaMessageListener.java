package com.goutam.service;


import com.goutam.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "goutam-kafka-demo-5", groupId = "gk-group")
    public void consume(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

//    @KafkaListener(topics = "goutam-kafka-demo-4", groupId = "gk-group")
//    public void consume1(String message) {
//        log.info("consumer1 consume the message {} ", message);
//    }

//    @KafkaListener(topics = "goutam-kafka-demo-4", groupId = "gk-group")
//    public void consume2(String message) {
//        log.info("consumer2 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "goutam-kafka-demo-4", groupId = "gk-group")
//    public void consume3(String message) {
//        log.info("consumer3 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "goutam-kafka-demo-4", groupId = "gk-group")
//    public void consume4(String message) {
//        log.info("consumer4 consume the message {} ", message);
//    }
}
