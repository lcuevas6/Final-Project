package com.finalproject.video.game.database.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.Genre;
import com.finalproject.video.game.database.api.repository.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repo;
	
	
	public Iterable<Genre> getGenres(){
		return repo.findAll();
	}
	
	public Genre getGenre(Long genreId) {
		return repo.findById(genreId).get();
	}
	
	public Genre createGenre(Genre genre) {
		return repo.save(genre);
	}
	
	public void deleteGenre(Long genreId) {
		repo.deleteById(genreId);
	}	

}
