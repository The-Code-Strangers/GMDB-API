package net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    
} 
