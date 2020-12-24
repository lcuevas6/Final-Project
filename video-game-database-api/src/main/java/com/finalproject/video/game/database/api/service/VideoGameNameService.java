package com.finalproject.video.game.database.api.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.Genre;
import com.finalproject.video.game.database.api.entity.VideoGameName;
import com.finalproject.video.game.database.api.repository.VideoGameNameRepository;
import com.finalproject.video.game.database.api.repository.GenreRepository;

@Service
public class VideoGameNameService {
	
	@Autowired
	private VideoGameNameRepository repo;
	
	@Autowired
	private GenreRepository genreRepo;
	
	
	public Iterable<VideoGameName> getAllGameNames() {
		return repo.findAll();
	}
	
	public VideoGameName getVideoGameName(Long gameId) {
		return repo.findById(gameId).get();
	}
	
	public VideoGameName createVideoGameName(VideoGameName videoGameName) {
		return repo.save(videoGameName);
		
	}
	
	public void deleteVideoGameName(Long gameId) {
		repo.deleteById(gameId);
	}	
	
	public VideoGameName genreType (Long gameId, Long genreId) throws Exception{
		Genre genre = genreRepo.findById(genreId).get();
		VideoGameName game = repo.findById(gameId).get();
		if(game == null || genre == null) {
			throw new Exception("Game does not exist.");
		}
		return game;
}
}

