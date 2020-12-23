package com.finalproject.video.game.database.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Genre {
	private Long id;
	private String genre;

	
	@JsonIgnore
	private VideoGameName game;
	
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
//	}
//	
//	@ManyToMany
//	@JoinColumn(name = "game")
//	public VideoGameName getGame() {
//		return game;
//	}
//	public void setGame(VideoGameName game) {
//		this.game = game;
	}
}
