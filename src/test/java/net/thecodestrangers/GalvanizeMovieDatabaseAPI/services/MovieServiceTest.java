package net.thecodestrangers.GalvanizeMovieDatabaseAPI.services;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Movie;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories.MovieRepository;
/**
 * MovieServiceTest
 */
@SpringBootTest
public class MovieServiceTest {

    @Autowired
    MovieService movieService;

    @MockBean
    MovieRepository mockMovieRepository;


    @Test
    void getEntriesReturnsEmptyList() {
        List<Movie> list = new ArrayList<>();
        when(mockMovieRepository.findAll()).thenReturn(list);

        Assertions.assertEquals(movieService.getEntries(),list);
        verify(mockMovieRepository).findAll();
    }
    
}