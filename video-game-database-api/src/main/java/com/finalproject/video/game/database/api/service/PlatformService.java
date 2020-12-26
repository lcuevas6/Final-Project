package com.finalproject.video.game.database.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.Platform;
import com.finalproject.video.game.database.api.repository.PlatformRepository;


@Service
public class PlatformService {
		@Autowired
		private PlatformRepository repo;
		
		public Iterable<Platform> getPlatforms(){
			return repo.findAll();
		}
		public Platform getPlatform(Long platformId) {
			return repo.findById(platformId).get();
		}
		
		public Platform createPlatform (Platform platform) {
			return repo.save(platform);
	
		}
		
		public void deletePlatform(Long platformId) {
			repo.deleteById(platformId);
		}	
}
