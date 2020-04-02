package net.thecodestrangers.GalvanizeMovieDatabaseAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/reviews")
    public List<Review> getReviews(@RequestParam(required = false) Long movieId) {
        return reviewService.getEntries(movieId);
    }
 
    

        // We can configure our @RequestParam to be optional, though, with the required attribute:

        // @GetMapping("/api/foos")
        // @ResponseBody
        // public String getFoos(@RequestParam(required = false) String id) { 
        //     return "ID: " + id;
        // }
        // In this case, both:
        
        
        // http://localhost:8080/api/foos?id=abc
        // ----
        // ID: abc

}


    
