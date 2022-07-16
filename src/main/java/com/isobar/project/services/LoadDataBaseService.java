package com.isobar.project.services;

import com.isobar.project.repositories.BandRepository;
import com.isobar.project.entities.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabaseService {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabaseService.class);

    @Bean
    CommandLineRunner initDatabase(BandRepository repository) {

        //returning some fake data for an example of preloading the data from the endpoint

        return args -> {
            log.info("Preloading " + repository.save(new Band()));
            log.info("Preloading " + repository.save(new Band()));
        };
    }
}