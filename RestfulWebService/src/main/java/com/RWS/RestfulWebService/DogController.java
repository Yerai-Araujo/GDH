package com.RWS.RestfulWebService;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DogController {

    private final static Dog NONE = new Dog("None");
    private final DogRepository repository;

    public DogController(DogRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api")
    public List<DogResource> getAll() {

        return repository.findAll().stream()
                .map(dog -> new DogResource(dog, "success"))
                .collect(Collectors.toList());
    }

    @GetMapping("/api/{id}")
    public DogResource getOne(@PathVariable Long id) {

        return repository.findById(id)
                .map(dog -> new DogResource(dog, "success"))
                .orElse(new DogResource(NONE, "Quote " + id + " does not exist"));
    }
    
}


