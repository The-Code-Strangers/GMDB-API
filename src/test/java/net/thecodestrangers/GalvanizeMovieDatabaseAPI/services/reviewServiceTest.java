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

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories.ReviewRepository;
/**
 * MovieServiceTest
 */
@SpringBootTest
public class reviewServiceTest {

    @Autowired
    ReviewService reviewService;

    @MockBean
    ReviewRepository mockReviewRepository;
  

    @Test
    void getEntriesReturnsEmptyList() {
        List<Review> list = new ArrayList<>();
        when(mockReviewRepository.findAll()).thenReturn(list);

        Assertions.assertEquals(reviewService.getEntries(),list);
        verify(mockReviewRepository).findAll();
    }
    
}