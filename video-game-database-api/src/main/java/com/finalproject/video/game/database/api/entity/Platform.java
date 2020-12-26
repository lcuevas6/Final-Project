package com.finalproject.video.game.database.api.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;






@Entity
public class Platform {

	private Long id;
	private String platform;
	private Set<VideoGameName> games;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	@ManyToMany(targetEntity = VideoGameName.class, mappedBy = "platforms", cascade = {CascadeType.PERSIST, CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
	public Set<VideoGameName> getGames(){
		return games;
	}
	
	public void setGames(Set<VideoGameName>games) {
		this.games = games;
	}
}


