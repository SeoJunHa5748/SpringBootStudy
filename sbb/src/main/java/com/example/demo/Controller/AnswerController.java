package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {
	
	private final QuestionService questionService;
	private final AnswerService answerService;
	
	
	@PostMapping("/create/{id}")
	public String createAnswer(Model model,@PathVariable("id") Integer id,
		@RequestParam(value = "content") String content) {
	
		Question question = this.questionService.getQuestion(id);
		this.answerService.RegAnswer(question, content);
		return String.format("redirect:/question/detail/%s" , id);
	
}
}
