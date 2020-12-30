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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Genre {
	private Long id;
	private String genre;
	
	@JsonIgnore
	private Set<VideoGameName> videoGameNames;

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

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "genre_videoGameName", joinColumns = @JoinColumn(name = "videoGameNameId", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "genreId", referencedColumnName = "id"))
	public Set<VideoGameName> getVideoGameNames() {
		return videoGameNames;
	}

	public void setVideoGameNames(Set<VideoGameName> videoGameNames) {
		this.videoGameNames = videoGameNames;
	}
}
