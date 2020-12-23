package com.finalproject.video.game.database.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.finalproject.video.game.database.api.entity.User;
import com.finalproject.video.game.database.api.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
		
	public User login(User user) throws Exception {
		User foundUser = repo.findByUsername(user.getUsername());
		if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
			return foundUser;
		} else {
			throw new Exception("Invalid username or password.");
		}
	}
	
	public User getUserById(Long id) throws Exception {
		try {
			return repo.findById(id).get();
		} catch (Exception e) {
			throw new Exception("Exception occurred while trying to find user.");
		}
	}
	
	public User createUser(User user) {
		return repo.save(user);
	}

	public User updateUser(User user, Long id) throws Exception {
		try {
			User newUser = repo.findById(id).get();
			newUser.setUsername(user.getUsername());
			newUser.setPassword(user.getPassword());
			return repo.save(newUser);
		} catch (Exception e) {
			throw new Exception("User does not exist.");
		}
		}
	
	public void deleteUser(Long id) throws Exception {
		try {
			repo.deleteById(id);
		}catch (Exception e) {
			throw new Exception("Unable to delete user.");
		}
	}
	
	
	
	}
	
	
	
	
	
	