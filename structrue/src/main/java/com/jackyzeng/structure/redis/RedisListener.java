package com.jackyzeng.structure.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RedisListener implements MessageListener {

    private final Jackson2JsonRedisSerializer<Object> serializer = new Jackson2JsonRedisSerializer<>(Object.class);

    @Override
    public void onMessage(Message message, byte[] pattern) {
        log.debug("Get from channel: " +  new String(pattern));
        log.debug("Get from channel: " + new String(message.getChannel()));
        log.debug("Meta message: " + new String(message.getBody()));
        log.debug("Deserialized message: " + serializer.deserialize(message.getBody()));
    }
}
