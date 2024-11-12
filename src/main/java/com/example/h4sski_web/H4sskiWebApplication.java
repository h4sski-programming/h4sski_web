package com.example.h4sski_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class H4sskiWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(H4sskiWebApplication.class, args);
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "Hello, it's passed message from java code.");
		return "index";
	}
}
