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

import com.example.Quiz_Component.Entities.User;
import com.example.Quiz_Component.Repos.UserReposatory;
import com.example.Quiz_Component.classes.Evaluator;



@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserReposatory userRepo;
	private Evaluator evl ;
	
	@GetMapping("/users")
	public List<User> getAll() {
		return (List<User>) userRepo.findAll();
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable (value = "id")Long id) {
		return userRepo.findById(id);
		
	}
	
	@PostMapping("/users")
	public User addUser(@Valid @RequestBody User user) {
		evl = new Evaluator(user.getUser_id(), user.getQuiz_id(), user.getAnswer());
		user = evl.calulateScore();
		return userRepo.save(user);
	}
	
}
