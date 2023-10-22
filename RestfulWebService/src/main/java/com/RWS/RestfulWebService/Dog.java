package com.RWS.RestfulWebService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Dog {

    @Id
    @GeneratedValue
    private Long id;
    private String dog;

    Dog(String dog) {
        this.dog = dog;
    }

    protected Dog() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Dog))
            return false;
        Dog dog1 = (Dog) o;
        return Objects.equals(id, dog1.id) && Objects.equals(dog, dog1.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dog);
    }

    @Override
    public String toString() {
        return "Dog{" + "id=" + id + ", dog='" + dog + '\'' + '}';
    }
}
