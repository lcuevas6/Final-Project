package com.finalproject.video.game.database.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.Genre;
import com.finalproject.video.game.database.api.repository.GenreRepository;

import com.finalproject.video.game.database.api.repository.VideoGameNameRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repo;
	
	@Autowired VideoGameNameRepository gameRepo;
	
	public Iterable<Genre> getGenres(){
		return repo.findAll();
	}
	
	public Genre createGenre(Genre genre) {
		return repo.save(genre);
	}

}
