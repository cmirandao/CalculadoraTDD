package com.kodea.tdd.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.kodea.tdd")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}