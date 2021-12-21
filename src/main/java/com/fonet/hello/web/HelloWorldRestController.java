package com.fonet.hello.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorldRestController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public ResponseEntity<String> welcome() {
		return ResponseEntity.ok("Welcome to Rest Hello World");
	}
	
	
}
