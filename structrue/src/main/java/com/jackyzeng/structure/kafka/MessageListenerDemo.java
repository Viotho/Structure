package com.jackyzeng.structure.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class MessageListenerDemo {

    @Autowired
    private ObjectMapper objectMapper;

    @KafkaListener(topics = "topic", groupId = "groupId")
    public void onMessage(@Payload String message, @Header("type") String type) throws IOException {
        objectMapper.readValue(message, getType(type));
    }

    @SuppressWarnings("uncheck")
    private static <T> Class<T> getType(String type) {
        try {
            return (Class<T>)Class.forName(type);
        } catch (ClassNotFoundException exception) {
            throw new RuntimeException(exception);
        }
    }
}
