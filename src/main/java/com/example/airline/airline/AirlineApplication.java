package com.example.airline.airline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.airline.airline", "com.speedment.jpastreamer"})
public class AirlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineApplication.class, args);
	}

}
