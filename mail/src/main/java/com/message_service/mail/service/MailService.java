package com.message_service.mail.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@KafkaListener(topics = "mail-service", groupId = "mail-service-group")
public class MailService {

    public void sendMail(String message) {
        System.out.println(message);
    }

}
