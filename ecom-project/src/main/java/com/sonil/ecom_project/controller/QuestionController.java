package com.sonil.ecom_project.controller;

import com.sonil.ecom_project.model.Question;
import com.sonil.ecom_project.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){

        return questionService.getAllQuestions();


    }
    @GetMapping("/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){

        return questionService.getQuestionsByCategory(category);


    }
    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){

        return questionService.addQuestion(question);

    }

}
