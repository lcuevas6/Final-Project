package com.finalproject.video.game.database.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Platform {

	private Long id;
	private String gameConsole;
	
	
	@JsonIgnore
	private VideoGameName game;
	
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
//	}
	
//	@ManyToOne
//	@JoinColumn(name = "gameId")
//	public VideoGameName getGame() {
//		return game;
//	}
//	
//	public void setGame(VideoGameName game) {
//		this.game = game;
	}

}
