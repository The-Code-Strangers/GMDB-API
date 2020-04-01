package net.thecodestrangers.GalvanizeMovieDatabaseAPI.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Movie;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories.MovieRepository;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories.ReviewRepository;

/**
 * MovieRepositoryTest
 */
@DataJpaTest
@Transactional
public class ReviewRepositoryTest {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void canSaveAReview() {
        Review review = new Review();
        review.setContent("Hi");
        review = reviewRepository.save(review);
        Optional<Review> persistedResult = reviewRepository.findById(review.getId());
        Assertions.assertThat(persistedResult.isPresent()).isTrue();
        Assertions.assertThat(persistedResult.get().getContent()).isEqualTo("Hi");
    }
    
    
}