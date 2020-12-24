package com.finalproject.video.game.database.api.entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class VideoGameName {

	private Long id;
	private String name;
	private String description;
	private String ageGroup;
	private Set<Review> reviews;
	private Set<Genre> genres;
	
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
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "game_genre", 
      joinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id"), 
      inverseJoinColumns = @JoinColumn(name = "game_Id", referencedColumnName = "id"))
    public Set<Genre> getGenres(){
		return genres;
	}
	
	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}
}
