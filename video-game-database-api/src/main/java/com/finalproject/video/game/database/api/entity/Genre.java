package com.finalproject.video.game.database.api.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Genre {
	long id;
	private String genre;
	private VideoGameName gameId;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@ManyToOne
	@JoinColumn(name = "gameId")
	public VideoGameName getGameId() {
		return gameId;
	}
	public void setGameId(VideoGameName gameId) {
		this.gameId = gameId;
	}

}
