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
import org.springframework.test.context.ActiveProfiles;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories.ReviewRepository;

@SpringBootTest
@ActiveProfiles(profiles = "test")
public class ReviewServiceTest {

    @Autowired
    ReviewService reviewService;

    @MockBean
    ReviewRepository mockReviewRepository;

    @Test
    void getEntriesReturnsEmptyList() {
        List<Review> list = new ArrayList<>();
        when(mockReviewRepository.findAll()).thenReturn(list);
        
        Assertions.assertEquals(list, reviewService.getEntries());
        verify(mockReviewRepository).findAll();
    }

   @Test
   void shouldGetTheRightEntryForTheRightId() {
       List<Review> filteredReviewList = new ArrayList<>();

       Long[] movieIdArray = {1L, 1L};

       for (Long movieId : movieIdArray) {
           Review review = new Review();
           review.setMovieId(movieId);
           filteredReviewList.add(review);
       }
       when(mockReviewRepository.findAllByMovieId(1L)).thenReturn(filteredReviewList);

       Assertions.assertEquals(filteredReviewList, reviewService.getEntries(1L));
       verify(mockReviewRepository).findAllByMovieId(1L);
   }

}