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
//import com.finalproject.video.game.database.api.service.PlatformService;
import com.finalproject.video.game.database.api.entity.Review;
import com.finalproject.video.game.database.api.service.PlatformService;
import com.finalproject.video.game.database.api.service.ReviewService;

@RestController
@RequestMapping("/users/{userId}/platform")
public class PlatformController {
	@Autowired
	private PlatformService service;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> createPlatform(@RequestBody Platform platform, @PathVariable Long id)
			 {
		try {
			return new ResponseEntity<Object>(service.createPlatform(platform,id, HttpStatus.OK));
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	
}
