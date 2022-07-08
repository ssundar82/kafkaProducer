package com.plexus.main.kafkaproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.plexus.*")
public class KafkaHttpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaHttpDemoApplication.class, args);
	}

}
