package com.example.springbootbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")

public class HelloController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello There!";
	}
}
