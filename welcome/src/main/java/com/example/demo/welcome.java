package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
	@GetMapping("rg")
	public String welcome()
	{
		return"welcome string boot";
	}
}
