package com.jackyzeng.structure.common.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomSink {
    @Input("customInput")
    SubscribableChannel customInput();
}
