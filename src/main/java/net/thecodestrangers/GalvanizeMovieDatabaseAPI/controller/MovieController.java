package net.thecodestrangers.GalvanizeMovieDatabaseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Movie;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.services.MovieService;

/**
 * movieController
 */
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @CrossOrigin
    @GetMapping(value = "/movies")
    public List<Movie> getMovies() {
        return movieService.getEntries();
    }
    
}