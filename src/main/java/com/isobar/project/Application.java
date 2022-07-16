package com.isobar.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}


	//The project is not quite working but I was able to organize it the way I intended. From here is discovering about the error I'm getting (goal failed to execute)
	//and creating the other controllers/exceptions/advices. Also implementing the caching part wich I I'm still going to try later

}
