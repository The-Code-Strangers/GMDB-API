// package net.thecodestrangers.GalvanizeMovieDatabaseAPI.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Review;
// import net.thecodestrangers.GalvanizeMovieDatabaseAPI.services.ReviewService;

// /**
//  * reviewController
//  */
// @RestController

// public class reviewController {

//     @Autowired
//     private ReviewService reviewService;

//     @CrossOrigin
//     @GetMapping(value="/review")
//     public List<Review> getReviews(){
//         return reviewService.getEntries();
//     }



    
// }