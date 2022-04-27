package com.springboot.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGradleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGradleAppApplication.class, args);
		
		System.out.println("Hello YODA");
	}

}
