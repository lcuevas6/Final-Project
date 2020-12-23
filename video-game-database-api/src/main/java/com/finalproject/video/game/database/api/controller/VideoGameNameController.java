package com.finalproject.video.game.database.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.video.game.database.api.entity.VideoGameName;
import com.finalproject.video.game.database.api.service.VideoGameNameService;

@RestController
@RequestMapping("/videoGameNames")
public class VideoGameNameController {
	
	@Autowired
	private VideoGameNameService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Object> getAllVideoGameNames() {
		return new ResponseEntity<Object>(service.getAllGameNames(), HttpStatus.OK);
	
}
	
	@RequestMapping(value="/{gameId}", method=RequestMethod.GET)
	public ResponseEntity<Object> getVideoGameName(@PathVariable Long gameId) {
		try {
			return new ResponseEntity<Object>(service.getVideoGameName(gameId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Object> createVideoGameName(@RequestBody VideoGameName game) {
				return new ResponseEntity<Object>(service.createVideoGameName(game), HttpStatus.CREATED);
		
}
	@RequestMapping(value = "/{gameId}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteGame(@PathVariable Long gameId) {
		service.deleteVideoGameName(gameId);
		return new ResponseEntity<Object>("Deleted game with id:" + gameId, HttpStatus.OK);
}
}

