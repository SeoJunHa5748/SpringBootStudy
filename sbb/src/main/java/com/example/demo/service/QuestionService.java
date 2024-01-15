package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.QuestionRepository;
import com.example.demo.entity.Question;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

	private final QuestionRepository questionRepository;
	
	public List<Question> getAllQustion(){
		return questionRepository.findAll();
	}
	
	public Question getQuestion(Integer id) {
		Optional<Question> question = questionRepository.findById(id);
		return question.get();
	}

	public void createQustion(String subject,String content) {
		Question q1 = new Question();
		q1.setSubject(subject);
		q1.setContent(content);
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
	}
}
