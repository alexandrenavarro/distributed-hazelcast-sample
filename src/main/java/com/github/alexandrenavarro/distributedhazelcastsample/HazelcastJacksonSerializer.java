package com.github.alexandrenavarro.distributedhazelcastsample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazelcast.nio.serialization.ByteArraySerializer;

import java.io.IOException;

public class HazelcastJacksonSerializer<T> implements ByteArraySerializer<T> {

    private final Class<T> clazz;
    private final ObjectMapper objectMapper;

    public HazelcastJacksonSerializer(final Class<T> clazz, final ObjectMapper objectMapper) {
        this.clazz = clazz;
        this.objectMapper = objectMapper;
    }

    @Override
    public byte[] write(T t) throws IOException {
        return objectMapper.writeValueAsBytes(t);
    }

    @Override
    public T read(byte[] bytes) throws IOException {
        return objectMapper.readValue(bytes, this.clazz);
    }

    @Override
    public int getTypeId() {
        return clazz.getCanonicalName().hashCode();
    }

    @Override
    public void destroy() {
    }
}
