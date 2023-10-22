package com.RWS.RestfulWebService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DatabaseLoader {

    @Bean
    CommandLineRunner init(DogRepository repository) {

        return args -> {
            repository.save(new Dog("Border Collie"));
            repository.save(new Dog("Beagle"));
            repository.save(new Dog("Chihuahua"));
            repository.save(new Dog("Pastor Belga"));
        };
    }
}