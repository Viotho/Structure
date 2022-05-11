package com.jackyzeng.structure.common.redis.cache;

import com.github.xiaolyuh.annotation.CachePut;
import com.github.xiaolyuh.annotation.Cacheable;
import com.github.xiaolyuh.annotation.FirstCache;
import com.github.xiaolyuh.annotation.SecondaryCache;
import com.github.xiaolyuh.support.CacheMode;
import org.springframework.cache.annotation.CacheEvict;

import java.util.concurrent.TimeUnit;

public class UsingCacheDemo {

    @Cacheable(value = "cache:name", depict = "XX信息缓存", cacheMode = CacheMode.ALL,
            firstCache = @FirstCache(expireTime = 4, timeUnit = TimeUnit.SECONDS),
            secondaryCache = @SecondaryCache(expireTime = 10, preloadTime = 3, forceRefresh = true, timeUnit = TimeUnit.SECONDS))
    public void cacheableDemo() {
    }

    @CachePut(value = "cache:name", key = "#param", depict = "XX信息缓存", cacheMode = CacheMode.ALL,
            firstCache = @FirstCache(expireTime = 4, timeUnit = TimeUnit.SECONDS),
            secondaryCache = @SecondaryCache(expireTime = 10, preloadTime = 3, forceRefresh = true, timeUnit = TimeUnit.SECONDS))
    public void cachePutDemo(String param) {
    }

    @CacheEvict(value = "cache:name", key = "#param")
    public void cacheEvictDemo(String param) {
    }

    @CacheEvict(value = "cache:name", allEntries = true)
    public void cacheEvictAllDemo() {
    }
}
