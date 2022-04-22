package com.jackyzeng.structure.common.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(CustomSink.class)
public class ReceiveService {

    @StreamListener("customInput")
    public void receiveMessage(Object payload) {
        System.out.println(payload);
    }
}
