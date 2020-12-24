package com.finalproject.video.game.database.api.entity;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Genre {
	private Long id;
	private String genre;
	private Set<VideoGameName> games;

	

	
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
	@ManyToMany(mappedBy = "genres")
	public Set<VideoGameName> getGames(){
			return games;
		}
	public void setGames(Set<VideoGameName> games) {
		this.games = games;
	}
}

