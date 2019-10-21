package com.github.alexandrenavarro.distributedhazelcastsample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@CacheConfig(cacheNames = "instruments")
public class DataRepository {

    @Cacheable()
    public Data getData(String i) {
        log.info("DataRepository.getData");
        return Data.builder()
                .id(i)
                .label("label" + i)
                .build();
    }

    @CachePut(key="#data.id")
    public Data saveData(Data data) {
        log.info("DataRepository.saveData");
        return data;
    }
}
