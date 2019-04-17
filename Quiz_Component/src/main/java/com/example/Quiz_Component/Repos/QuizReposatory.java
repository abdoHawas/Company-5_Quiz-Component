package com.example.Quiz_Component.Repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.Quiz_Component.Entities.Quiz;

@RepositoryRestResource
public interface QuizReposatory extends CrudRepository<Quiz, Long>{

}
