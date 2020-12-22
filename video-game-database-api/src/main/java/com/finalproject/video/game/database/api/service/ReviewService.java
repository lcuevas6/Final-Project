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
	
	public Iterable<Review> getAllReviews(){
		return repo.findAll();
	}
	
	public Review getReview(Long reviewId) {
		return repo.findById(reviewId).get();
	}
	
	public Review updateReview(Review review, Long reviewId) throws Exception{
		Review foundReview = repo.findById(reviewId).get();
		if (foundReview == null) {
			throw new Exception("Review not found.");
		}
		foundReview.setContent(review.getContent());
		return repo.save(foundReview);
	}
	
	public Review createReview(Review review, Long userId, Long gameId) throws Exception{
		User user = userRepo.findById(userId).get();
		VideoGameName game = gameRepo.findById(gameId).get();
		if (user == null || game == null) {
			throw new Exception("User or Game does not exist.");
		}
		review.setDate(new Date());
		review.setUser(user);
		review.setGame(game);
		return repo.save(review);
	}
	
	public void deleteReview(Long reviewId) {
		repo.deleteById(reviewId);
	}

}
