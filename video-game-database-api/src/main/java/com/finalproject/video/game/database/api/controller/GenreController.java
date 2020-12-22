package com.finalproject.video.game.database.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finalproject.video.game.database.api.entity.Genre;
import com.finalproject.video.game.database.api.entity.Platform;
import com.finalproject.video.game.database.api.service.GenreService;
import com.finalproject.video.game.database.api.service.PlatformService;

public class GenreController {
	
	@Autowired
	private GenreService service;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> createGenre(@RequestBody Genre genre, @PathVariable Long id)
			 {
		try {
			return new ResponseEntity<Object>(service.createGenre(genre,id, HttpStatus.OK));
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
