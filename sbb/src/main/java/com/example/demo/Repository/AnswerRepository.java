package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
