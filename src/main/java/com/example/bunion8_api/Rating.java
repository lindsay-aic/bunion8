package com.example.bunion8_api;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rating")
public class Rating {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="movie_id", nullable=false)
	private MovieInfo movieInfo;
	
	private int stars;

	public Long getId() {
		return id;
	}

	public MovieInfo getSeriesInfo() {
		return movieInfo;
	}

	public int getStars() {
		return stars;
	}

	public void setMoviesInfo(MovieInfo moviesInfo) {
		this.movieInfo = movieInfo;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}
	
	
}
