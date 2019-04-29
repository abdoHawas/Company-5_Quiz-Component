package com.example.Quiz_Component.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Quiz_Component.Entities.Quiz;
import com.example.Quiz_Component.Repos.QuizReposatory;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
	@Autowired
	private QuizReposatory quizRepo;
	
	@GetMapping("/quizzes")
	public List<Quiz> getAll() {
		return (List<Quiz>) quizRepo.findAll();
	}
	
	@GetMapping("/quizzes/{id}")
	public Optional<Quiz> getQuiz(@PathVariable (value = "id")Long id) {
		return quizRepo.findById(id);
		
	}
	
	@PostMapping("/quizzes")
	public Quiz addQuiz(@Valid @RequestBody Quiz quiz) {
		return quizRepo.save(quiz);
	}
	
	
}
