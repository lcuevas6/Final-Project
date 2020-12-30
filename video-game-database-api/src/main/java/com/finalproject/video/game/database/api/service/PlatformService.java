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

	@Autowired
	VideoGameNameRepository gameRepo;

	public Iterable<Platform> getPlatforms() {
		return repo.findAll();
	}

	public Platform createPlatform(Platform platform) {
		return repo.save(platform);

	}  //original

	
	
	/*public Platform createPlatform(Platform platform, Set<Long> videoGameNameId) throws Exception  {
		try {
		VideoGameName game = gameRepo.findAllById(videoGameNameId);//.get();//findById(videoGameNameId).get();
		
		
		} catch (Exception e) {
		}return repo.save(platform);
		}
		
		/*public Review createReview(Review review, Long userId, Long gameId) throws Exception{
			User user = userRepo.findById(userId).get();
			VideoGameName game = gameRepo.findById(gameId).get();
			if (user == null || game == null) {
				throw new Exception("User or Game does not exist.");
			}
			review.setDate(new Date());
			review.setUser(user);
			review.setGame(game);
			return repo.save(review);
		*/
		
		
		
		
		
		
		
	
	public void deletePlatform(Long platformId) {
		repo.deleteById(platformId);
	}
}
