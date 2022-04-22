package com.jackyzeng.structure.common.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomSource {
    @Output("customOutput")
    MessageChannel customOutput();
}
