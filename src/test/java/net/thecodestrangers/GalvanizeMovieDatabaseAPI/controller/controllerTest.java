package net.thecodestrangers.GalvanizeMovieDatabaseAPI.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.entities.Movie;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.services.MovieService;

@WebMvcTest
public class controllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    MovieService movieServiceMock;

    // @Test
    // void shouldShowAllMovies() throws Exception {
    //     ArrayList<Movie> movieList = new ArrayList<>();
    //     Movie movie = new Movie();
    //     movie.setTitle("Robert and Christian on the Coding Road");
    //     movie.setReleaseYear(2020);
    //     movieList.add(movie);
    //     movieList.add(new Movie());

    //     when(movieServiceMock.getEntries()).thenReturn(movieList);

    //     mvc.perform(get("/movies")).andExpect(status().isOk())
    //             .andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$").isArray())
    //             .andExpect(jsonPath("$", hasSize(2)));// From Hamcrest

    //     verify(movieServiceMock).getEntries();

    // }

}