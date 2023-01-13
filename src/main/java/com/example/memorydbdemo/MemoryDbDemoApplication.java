package com.example.memorydbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MemoryDbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoryDbDemoApplication.class, args);
	}

}
