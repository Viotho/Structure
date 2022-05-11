package com.jackyzeng.structure;

import com.github.xiaolyuh.cache.config.EnableLayeringCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableLayeringCache
@SpringBootApplication
public class StructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(StructureApplication.class, args);
    }
}
