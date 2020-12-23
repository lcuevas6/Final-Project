package com.finalproject.video.game.database.api.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.video.game.database.api.entity.Platform;

import com.finalproject.video.game.database.api.service.PlatformService;

@RestController
@RequestMapping("/platforms")
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
	}
}
