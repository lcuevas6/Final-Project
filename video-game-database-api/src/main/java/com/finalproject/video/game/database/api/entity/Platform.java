package com.finalproject.video.game.database.api.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Platform {

	private long id;
	private String gameConsole;
	private VideoGameName gameId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getGameConsole() {
		return gameConsole;
	}
	public void setGameConsole(String gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	@ManyToOne
	@JoinColumn(name = "gameId")
	public VideoGameName getGameName() {
		return gameId;
	}
	
	public void setGameName(VideoGameName gameName) {
		this.gameId = gameName;
	}

	
	
	

}
