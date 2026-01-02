package com.learning.microservice_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Microservice1Application {
    @Value("${server.port}")
    private static String tempPort;
	public static void main(String[] args) {
        System.out.println("PORTTT + "+tempPort);
        SpringApplication.run(Microservice1Application.class, args);
	}

}
