package net.thecodestrangers.GalvanizeMovieDatabaseAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"contoller"})
public class GalvanizeMovieDatabaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalvanizeMovieDatabaseApiApplication.class, args);
	}
}
