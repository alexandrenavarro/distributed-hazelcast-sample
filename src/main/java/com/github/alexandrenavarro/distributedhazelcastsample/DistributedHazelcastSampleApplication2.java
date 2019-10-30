package com.github.alexandrenavarro.distributedhazelcastsample;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableEurekaClient
@EnableCaching
public class DistributedHazelcastSampleApplication2 {

	public static void main(String[] args) {
		SpringApplication springApp = new SpringApplication(DistributedHazelcastSampleApplication2.class);
		springApp.setAdditionalProfiles("instance2");
		springApp.run(args);
	}



}
