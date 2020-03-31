package net.thecodestrangers.GalvanizeMovieDatabaseAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Movie;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories.MovieRepository;


@Service
public class MovieService {

	@Autowired 
	MovieRepository movieRepository;

	public List<Movie> getEntries() {
		return movieRepository.findAll();
	}
	//For testing the app
	//Movie movie = new Movie();
	//movie.setTitle("Welcome");
	//movieRepository.save(movie);
}
