package com.finalproject.video.game.database.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.User;
import com.finalproject.video.game.database.api.entity.VideoGameName;
import com.finalproject.video.game.database.api.repository.UserRepository;
import com.finalproject.video.game.database.api.repository.VideoGameNameRepository;

@Service
public class VideoGameNameService {
	
	@Autowired
	private VideoGameNameRepository repo;
	
	@Autowired
	private UserRepository userRepo;
	
	public Iterable<VideoGameName> getAllGameNames() {
		return repo.findAll();
	}
	
	public VideoGameName getVideoGameName(Long videoGameNameId) {
		return repo.findById(videoGameNameId).get();
					}
	
	public VideoGameName createVideoGameName(VideoGameName game, Long userId, Long videoGameNameId) throws Exception {
		User user = userRepo.findById(userId).get();
		VideoGameName newGame = repo.findById(videoGameNameId).get();
		if (user == null) {
			throw new Exception("User not found.");
		}
		game.setUser(user);
		game.setGame(newGame);
		return repo.save(game);
		
	}

}
