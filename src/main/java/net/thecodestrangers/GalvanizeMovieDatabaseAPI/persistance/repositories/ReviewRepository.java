package net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	
	/**
	 * Finds all rewies matcvhing a sspecific movieId as a search criteria.
	 * @param movieId
	 * @return  A list of reviews whose movideId matches the param movieId.
	 *          If no review is found, this method returns an empty list.
	 */
	List<Review> findAllByMovieId(Long movieId);

    // @Query("SELECT p FROM Person p WHERE LOWER(p.lastName) = LOWER(:lastName)")
    // public List<Person> find(@Param("lastName") String lastName);

    
} 
