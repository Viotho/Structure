package com.jackyzeng.structure.common.redis.cache;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "namespace")
public class UsingCacheDemo {

    @Cacheable(key = "#p0")
    public void cacheableDemo(String param) {
        System.out.println(param);
    }

    @CachePut(key = "#p0")
    public void cachePutDemo(String param) {
        System.out.println(param);
    }

    @CacheEvict(key = "#p0", allEntries = true)
    public void cacheEvictDemo(String param) {
        System.out.println(param);
    }
}
