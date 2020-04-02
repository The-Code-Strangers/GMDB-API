package net.thecodestrangers.GalvanizeMovieDatabaseAPI.repository;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories.ReviewRepository;

@DataJpaTest
@ActiveProfiles(profiles = "test")
public class ReviewRepositoryTest {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void canSaveAReview() {
        Review review = new Review();
        review.setHeadLine("headline");

        review = reviewRepository.save(review);
        Optional<Review> persistedResult = reviewRepository.findById(review.getId());
        Assertions.assertThat(persistedResult.isPresent()).isTrue();
        Assertions.assertThat(persistedResult.get().getHeadLine()).isEqualTo("headline");
    }

    @Test
    public void canRetriveReviewsByMovieId() {

        Long[] movieIdArray = {1L, 2L, 1L};

        for (Long movieId : movieIdArray) {
            Review review = new Review();
            review.setMovieId(movieId);
            reviewRepository.save(review);
        }

        List<Review> filteredResults = reviewRepository.findAllByMovieId(1L);
        Assertions.assertThat(filteredResults.size()).isEqualTo(2);
    }
}