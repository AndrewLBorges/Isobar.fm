package com.isobar.project.controllers;

import java.util.List;

import com.isobar.project.repositories.*;
import com.isobar.project.entities.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BandController {

    private final BandRepository repository;

    BandController(BandRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/bands")
    List<Employee> all() {
        return repository.findAll();
    }

    // Single item

    @GetMapping("/band/{id}")
    Band one(@PathVariable String id) {

        return repository.findById(id)
                .orElseThrow(() -> new BandNotFoundException(id));
    }
}