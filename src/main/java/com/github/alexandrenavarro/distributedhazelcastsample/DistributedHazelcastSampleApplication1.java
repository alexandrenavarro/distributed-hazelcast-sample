package com.github.alexandrenavarro.distributedhazelcastsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DistributedHazelcastSampleApplication1 {

	public static void main(String[] args) {
		SpringApplication springApp = new SpringApplication(DistributedHazelcastSampleApplication1.class);
		springApp.setAdditionalProfiles("instance1");
		springApp.run(args);
	}

}
