package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
public class Maincontroller {

	@GetMapping("/")
	
	public String root() {
		return "Mainpage";
	}
}
