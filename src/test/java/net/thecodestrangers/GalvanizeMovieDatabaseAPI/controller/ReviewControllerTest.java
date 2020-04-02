package net.thecodestrangers.GalvanizeMovieDatabaseAPI.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.services.ReviewService;

@WebMvcTest(ReviewController.class)

public class ReviewControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    ReviewService mockReviewService;

    @Test
    void shouldShowAllReviews() throws Exception {
        List<Review> reviewList = new ArrayList<>();
        Review review = new Review();
        review.setHeadLine("headline");
        reviewList.add(review);
        reviewList.add(new Review());
    
        when(mockReviewService.getEntries()).thenReturn(reviewList);
        mvc.perform(get("/reviews")).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$", hasSize(2)));// From Hamcrest
        verify(mockReviewService).getEntries();
    }

}