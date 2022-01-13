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
	
	@RequestMapping("/say")
	@ResponseBody
	public String say() {
		return "Say Something...";
	}

	@RequestMapping("/clean")
	@ResponseBody
	public String clean() {
		return "Clean Everything...";
	}

	@RequestMapping("/develop")
	@ResponseBody
	public String develop() {
		System.out.print("develop");
		return "DEV...";
	}
	
}
