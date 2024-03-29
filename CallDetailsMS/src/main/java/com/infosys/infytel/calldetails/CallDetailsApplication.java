package com.infosys.infytel.calldetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//test
@SpringBootApplication
@EnableDiscoveryClient
public class CallDetailsApplication {
	public static void main(String[] args) {
		SpringApplication.run(CallDetailsApplication.class, args);
	}
}
