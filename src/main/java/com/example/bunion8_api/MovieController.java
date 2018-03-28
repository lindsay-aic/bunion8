package com.example.bunion8_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MovieController {
	
	@Autowired
	private MoviesInfoRepository movieInfoRepository;
	
	@PostMapping("/movie")
	public ResponseEntity<MovieInfo> addSeries(@RequestBody MovieInfo movies) {
		
		MovieInfo addedMovies = movieInfoRepository.save(movies);
		return ResponseEntity.ok(addedMovies);
	}
	
	
	@GetMapping("/movie")
	public List<MovieInfo> getMovieInfo() {
		return movieInfoRepository.findAll();
	}
	
//	@GetMapping
//	public String test() {
//		
//		
//		MovieInfo newMovies = new MovieInfo();
//		newMovies.setTitle("Three Stooges");
//		
//		Rating rating = new Rating();
//		rating.setStars(5);
//		
//		Comment comment = new Comment();
//		comment.setBody("yuk yuk yuk");
//		
//		rating.setMoviesInfo(newMovies);
//		comment.setMovieInfo(newMovies);
//		newMovies.getRatings().add(rating);
//		newMovies.getComments().add(comment);
//		
//		movieInfoRepository.save(newMovies);
//		
//		return "test";
//		
//	}

}
