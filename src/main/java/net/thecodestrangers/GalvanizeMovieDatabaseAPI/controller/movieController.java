package net.thecodestrangers.GalvanizeMovieDatabaseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.entities.Movie;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.services.MovieService;

/**
 * movieController
 */
@RestController
public class movieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/movies")
    public List<Movie> getMovies() {
        return movieService.getEntries();
    }
    
}