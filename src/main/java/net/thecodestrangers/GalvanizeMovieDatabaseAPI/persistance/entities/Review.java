package net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Review
 */
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long movieId ;
    private Long userId;
    private String headLine;
    private String content;
    private int rating;

    public Review() {
    }

    public Review(Long movieId, Long userId, String headLine, String content, int rating) {
        this.movieId = movieId;
        this.userId = userId;
        this.headLine = headLine;
        this.content = content;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    

    

    
}