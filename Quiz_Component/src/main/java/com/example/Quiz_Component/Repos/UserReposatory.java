package com.example.Quiz_Component.Repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.Quiz_Component.Entities.User;

@RepositoryRestResource
public interface UserReposatory extends CrudRepository<User, Long>{

}
