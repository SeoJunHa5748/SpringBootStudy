package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.demo.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>  {
	Page<Question> findAll(Pageable pageable);
}
