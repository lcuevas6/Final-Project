package com.finalproject.video.game.database.api.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.video.game.database.api.entity.Platform;

import com.finalproject.video.game.database.api.service.PlatformService;

@RestController
@RequestMapping("/platforms")  ///users/{userId}/videoGameNames/{gameId}/reviews"
public class PlatformController {
	
	@Autowired
	private PlatformService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Object> getPlatforms(){
		return new ResponseEntity<Object>(service.getPlatforms(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> createPlatform(@RequestBody Platform platform) {
			return new ResponseEntity<Object>(service.createPlatform(platform), HttpStatus.CREATED);
	 //<<<<<Original>
	
	}
	/*@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> createPlatform(@RequestBody Platform platform, @PathVariable Long videoGameNameId) {
		try {
		//	return new ResponseEntity<Object>(service.createPlatform(platform, videoGameNameId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
			
	}*/
	
	
	
	@RequestMapping(value = "/{platformId}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteReview(@PathVariable Long platformId) {
		try {
		service.deletePlatform(platformId);
		return new ResponseEntity<Object>("Deleted platform with id:" + platformId, HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<Object>("Unable to delete platform.", HttpStatus.BAD_REQUEST);
	}
}
}
/*@RequestMapping(method = RequestMethod.POST)
public ResponseEntity<Object> createReview(@RequestBody Review review, @PathVariable Long userId,
		@PathVariable Long gameId) {
	try {
		return new ResponseEntity<Object>(service.createReview(review, userId, gameId), HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
}*/









