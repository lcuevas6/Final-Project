package com.finalproject.video.game.database.api.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Genre {
	Long id;
	private String genre;
	private VideoGameName gameId;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@ManyToOne
	@JoinColumn(name = "videoGameNameId")
	public VideoGameName getGameId() {
		return gameId;
	}
	public void setGameId(VideoGameName gameId) {
		this.gameId = gameId;
	}
}
