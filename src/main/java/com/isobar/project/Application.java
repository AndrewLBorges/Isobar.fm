package com.isobar.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}


	//The project is not quite working but I was able to organize it the way I intended. From here is discovering about the error I'm getting (goal failed to execute)
	//and creating the other controllers/exceptions/advices, as well as actually creating the objects for the entities from the data that is coming from the given Endpoint.
	// Also implementing the caching part wich  I'm still going to try later.

}
