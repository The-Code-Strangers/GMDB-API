package net.thecodestrangers.GalvanizeMovieDatabaseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;
import net.thecodestrangers.GalvanizeMovieDatabaseAPI.services.ReviewService;


/**
 * ReviewController
 */
@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping(value = "/reviews")
    public List<Review> getReviews() {
        return reviewService.getEntries();
    }
    
}


    
