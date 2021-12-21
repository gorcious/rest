package com.fonet.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class HelloApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloApplication.class, args);
	}
}
