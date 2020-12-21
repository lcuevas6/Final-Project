package com.finalproject.video.game.database.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.Genre;
import com.finalproject.video.game.database.api.entity.Platform;
import com.finalproject.video.game.database.api.entity.VideoGameName;
import com.finalproject.video.game.database.api.repository.GenreRepository;
import com.finalproject.video.game.database.api.repository.PlatformRepository;
import com.finalproject.video.game.database.api.repository.UserRepository;
import com.finalproject.video.game.database.api.repository.VideoGameNameRepository;

@Service
public class GenreService {
	@Autowired
	private GenreRepository repo;
	
	@Autowired VideoGameNameRepository gameRepo;
	
	@Autowired UserRepository userRepo;
	
	public Genre createGenre(Genre genre, Long gameId) throws Exception{
		VideoGameName game = gameRepo.findById(gameId).get();
		if (game == null) {
			throw new Exception("Genre does not exist.");
		}
		
		return repo.save(genre);
	}

}
