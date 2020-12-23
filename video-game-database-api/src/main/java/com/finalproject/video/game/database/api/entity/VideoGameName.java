package com.finalproject.video.game.database.api.entity;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class VideoGameName {

	private Long id;
	private String name;
	private String description;
	private String ageGroup;
	private Set<Review> reviews;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	@OneToMany(mappedBy = "game")
	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
	
}
