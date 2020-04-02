package net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data public class Review {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long movieId ;
    private Long userId;
    private String headLine;
    private String content;
    private int rating;

    
}