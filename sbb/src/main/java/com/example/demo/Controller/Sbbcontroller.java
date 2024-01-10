package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Sbbcontroller {
	
	@GetMapping("/sbb")
	@ResponseBody
	public String sbb() {
		return "안녕하세요 SBB 입니다";
	}
}
