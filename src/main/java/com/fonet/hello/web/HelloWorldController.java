package com.fonet.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String welcome() {
		return "Welcome to Hello World!";
	}

	@RequestMapping("/bye")
	@ResponseBody
	public String bye() {
		return "Bye Bye Hepiniz...";
	}
	
}
