package com.jackyzeng.structure.common.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(CustomSource.class)
public class SendService {

    @Autowired
    private CustomSource customSource;

    public void sendMessage(String message) {
        customSource.customOutput().send(MessageBuilder.withPayload(message).build());
    }
}
