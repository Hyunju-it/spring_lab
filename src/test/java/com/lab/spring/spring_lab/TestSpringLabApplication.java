package com.lab.spring.spring_lab;

import org.springframework.boot.SpringApplication;

public class TestSpringLabApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringLabApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
