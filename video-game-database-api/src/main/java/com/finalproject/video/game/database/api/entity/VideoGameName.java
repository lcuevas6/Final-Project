package com.finalproject.video.game.database.api.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class VideoGameName {

	
	private Long id;
	
	private VideoGameName game;
	
	private String description;
	
	private String ageGroup;
	
	private User user;
	
	
	private Set<Review> reviews;
	
	private Set<Platform> platforms;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public VideoGameName getGame() {
		return game;
	}
	
	public void setGame(VideoGameName game) {
		this.game = game;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getAgeGroup() {
		return ageGroup;
	}
	
	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}
	
	@OneToMany
	@JoinColumn(name = "videoGameName")
	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "platform",
	joinColumns = @JoinColumn(name = "videoGameNameId", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "platformId", referencedColumnName = "id"))
	public Set<Platform> getPlatforms() {
		return platforms;
	}

	public void setPlatforms(Set<Platform> platforms) {
		this.platforms = platforms;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
