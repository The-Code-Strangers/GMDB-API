package net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.thecodestrangers.GalvanizeMovieDatabaseAPI.persistance.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
