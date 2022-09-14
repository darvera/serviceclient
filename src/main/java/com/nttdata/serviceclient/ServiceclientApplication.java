package com.nttdata.serviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceclientApplication.class, args);
	}

}
