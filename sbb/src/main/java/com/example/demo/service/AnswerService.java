package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.AnswerRepository;
import com.example.demo.entity.Answer;
import com.example.demo.entity.Question;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {

	private final AnswerRepository answerRepository;
	
	public List<Answer> getAllAnswer(Iterable<Integer> id){
		return answerRepository.findAllById(id);
	}
	
	public void RegAnswer(Question question, String content) {
		Answer answer = new Answer();
		answer.setContent(content);
		answer.setCreateDate(LocalDateTime.now());
		answer.setQuestion(question);
		answerRepository.save(answer);
	}
}
