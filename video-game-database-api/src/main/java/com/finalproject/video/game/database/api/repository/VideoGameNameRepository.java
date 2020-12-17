package com.finalproject.video.game.database.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.finalproject.video.game.database.api.entity.VideoGameName;

public interface VideoGameNameRepository extends CrudRepository<VideoGameName, Long> {
	

}
