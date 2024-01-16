package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.QuestionRepository;
import com.example.demo.entity.Question;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

	private final QuestionRepository questionRepository;
	
	public Page<Question> getAllQustion(int page){
		List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("createDate"));
        Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
        return this.questionRepository.findAll(pageable);
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
