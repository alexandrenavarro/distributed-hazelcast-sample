package com.github.alexandrenavarro.distributedhazelcastsample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazelcast.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    @Bean
    public Config hazelcastConfig(final ObjectMapper objectMapper) {
        final Config config = new Config();
        config.setInstanceName("hazelcast-instance")
                .addMapConfig(
                        new MapConfig()
                                .setName("instruments")
                                .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                                .setEvictionPolicy(EvictionPolicy.LRU)
                );
        config.setProperty("hazelcast.rest.enabled", "true");
        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
        config.getNetworkConfig().getJoin().getEurekaConfig()
                .setEnabled(true)
                .setProperty("self-registration", "true")
                .setProperty("namespace", "hazelcast")
                .setProperty("use-metadata-for-host-and-port", "true");
        config.getSerializationConfig().getSerializerConfigs()
                .add(new SerializerConfig().setTypeClass(Data.class).setImplementation(new HazelcastJacksonSerializer<Data>(Data.class, objectMapper)));
        return config;
    }

}
