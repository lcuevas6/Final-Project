package com.finalproject.video.game.database.api.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.Platform;
import com.finalproject.video.game.database.api.repository.PlatformRepository;
import com.finalproject.video.game.database.api.repository.VideoGameNameRepository;

@Service
public class PlatformService {
		@Autowired
		private PlatformRepository repo;
		
		@Autowired VideoGameNameRepository gameRepo;
		
		public Iterable<Platform> getPlatforms(){
			return repo.findAll();
		}
		public Platform createPlatform(Platform platform) {
			return repo.save(platform);
	
		}
		
		
}
