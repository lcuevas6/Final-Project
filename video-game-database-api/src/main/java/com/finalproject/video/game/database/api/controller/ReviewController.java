package com.finalproject.video.game.database.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.video.game.database.api.entity.Review;
import com.finalproject.video.game.database.api.service.ReviewService;

@RestController
@RequestMapping("/users/{userId}/videGameNames/{gameId}/reviews")
public class ReviewController {

	@Autowired
	private ReviewService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Object> getAllReviews(){
			return new ResponseEntity<Object>(service.getAllReviews(), HttpStatus.OK);
	}
	@RequestMapping(value="/{reviewId}", method=RequestMethod.GET)
	public ResponseEntity<Object> getReview(@PathVariable Long reviewId){
			return new ResponseEntity<Object>(service.getReview(reviewId), HttpStatus.OK);
	}
	
	@RequestMapping(value="/{reviewId}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateReview(@RequestBody Review review, @PathVariable Long reviewId){
		try {
			return new ResponseEntity<Object>(service.updateReview(review, reviewId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> createReview(@RequestBody Review review, @PathVariable Long userId,
			@PathVariable Long gameId) {
		try {
			return new ResponseEntity<Object>(service.createReview(review, userId, gameId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/{reviewId}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteReview(@PathVariable Long reviewId) {
		service.deleteReview(reviewId);
		return new ResponseEntity<Object>("Deleted review with id:" + reviewId, HttpStatus.OK);
	}

}