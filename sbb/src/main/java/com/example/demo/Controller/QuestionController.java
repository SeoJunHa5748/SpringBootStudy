package com.example.demo.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Question;
import com.example.demo.service.QuestionService;

import lombok.RequiredArgsConstructor;
@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class QuestionController {

	
	
	private final QuestionService questionService;
	
	@GetMapping("/list")
	  public String list(Model model) {
        
        model.addAttribute("questionList", questionService.getAllQustion());
        return "question_list";
    }
	
	@GetMapping(value = "/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Question question = questionService.getQuestion(id);
		model.addAttribute("question",question);
		return "question_detail";
	}
	
	
	@GetMapping("/create")
	public String createQusetion() {
		//TODO question 객체 생성후에 데이터로 집어 넣어야지 -> post 방식으로처리
		return "question_form";
	}
	@PostMapping("/create")
	public String createQusetion(@RequestParam(value = "subject") String subject, @RequestParam(value = "content") String content) {
		questionService.createQustion(subject, content);
		return "redirect:/question/list";
	}
	
}

