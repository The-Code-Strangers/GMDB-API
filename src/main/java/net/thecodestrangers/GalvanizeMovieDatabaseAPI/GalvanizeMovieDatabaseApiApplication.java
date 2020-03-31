package net.thecodestrangers.GalvanizeMovieDatabaseAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GalvanizeMovieDatabaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalvanizeMovieDatabaseApiApplication.class, args);
	}
}
