package com.finalproject.video.game.database.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.finalproject.video.game.database.api.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	public User findByUsername(String username);

}
