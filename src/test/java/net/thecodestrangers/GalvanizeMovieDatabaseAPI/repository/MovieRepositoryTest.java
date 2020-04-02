package net.thecodestrangers.GalvanizeMovieDatabaseAPI.repository;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Movie;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories.MovieRepository;

/**
 * MovieRepositoryTest
 */
@DataJpaTest
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void canSaveAMovie() {
        Movie movie = new Movie();
        movie.setTitle("MovieTitle");
        movie = movieRepository.save(movie);
        Optional<Movie> persistedResult = movieRepository.findById(movie.getId());
        Assertions.assertThat(persistedResult.isPresent()).isTrue();
        Assertions.assertThat(persistedResult.get().getTitle()).isEqualTo("MovieTitle");
    }
    
    
}