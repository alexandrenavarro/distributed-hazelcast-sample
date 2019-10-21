package com.github.alexandrenavarro.distributedhazelcastsample;

import com.hazelcast.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class DistributedHazelcastSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedHazelcastSampleApplication.class, args);
	}



}
