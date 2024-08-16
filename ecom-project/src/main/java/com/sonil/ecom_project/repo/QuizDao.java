package com.sonil.ecom_project.repo;

import com.sonil.ecom_project.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
