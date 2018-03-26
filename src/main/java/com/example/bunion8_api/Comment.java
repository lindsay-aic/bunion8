package com.example.bunion8_api;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment {
	
	private String body;
	
	@OneToMany(cascade = CascadeType.ALL,
			fetch=FetchType.LAZY,
			mappedBy="seriesInfo")
	private Set<Comment> comments = new HashSet<>();
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="series_id", nullable=false)
	private SeriesInfo seriesInfo;



	public String getBody() {
		return body;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public Long getId() {
		return id;
	}



	public SeriesInfo getSeriesInfo() {
		return seriesInfo;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
	public void setSeriesInfo(SeriesInfo seriesInfo) {
		this.seriesInfo = seriesInfo;
	}

}
