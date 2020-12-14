package com.finalproject.video.game.database.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.Review;
import com.finalproject.video.game.database.api.entity.VideoGameName;
import com.finalproject.video.game.database.api.entity.User;
import com.finalproject.video.game.database.api.repository.ReviewRepository;
import com.finalproject.video.game.database.api.repository.VideoGameNameRepository;
import com.finalproject.video.game.database.api.repository.UserRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository repo;
	
	@Autowired VideoGameNameRepository gameRepo;
	
	@Autowired UserRepository userRepo;
	
	public Review createReview(Review review, Long userId, Long gameId) throws Exception{
		User user = userRepo.findOne(userId);
		VideoGameName game = gameRepo.findOne(gameId);
		if (user == null || game == null) {
			throw new Exception("User or Game does not exist.");
		}
		review.setDate(new Date());
		review.setUser(user);
		review.setGame(game);
		return repo.save(review);
	}
	
	public void deleteReview(Long reviewId) {
		repo.delete(reviewId);
	}

}
