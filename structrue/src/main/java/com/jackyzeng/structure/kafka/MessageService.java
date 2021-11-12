package com.jackyzeng.structure.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class MessageService {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, Object message) throws IOException {
        final ProducerRecord<String, String> producerRecord = new ProducerRecord<>(topic, objectMapper.writeValueAsString(message));
        producerRecord.headers().add("type", message.getClass().getName().getBytes(StandardCharsets.UTF_8));
        kafkaTemplate.send(producerRecord);
    }
}
