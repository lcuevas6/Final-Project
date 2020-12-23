package com.finalproject.video.game.database.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.video.game.database.api.entity.Genre;

import com.finalproject.video.game.database.api.service.GenreService;

@RestController
@RequestMapping("/genres")
public class GenreController {
	
	@Autowired
	private GenreService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Object> getGenres(){
		return new ResponseEntity<Object>(service.getGenres(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> createGenre(@RequestBody Genre genre){
			return new ResponseEntity<Object>(service.createGenre(genre), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{genreId}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteGenre(@PathVariable Long genreId) {
		service.deleteGenre(genreId);
		return new ResponseEntity<Object>("Deleted genre with id:" + genreId, HttpStatus.OK);
	}

}