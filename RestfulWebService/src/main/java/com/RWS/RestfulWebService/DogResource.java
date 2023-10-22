package com.RWS.RestfulWebService;

import java.util.Objects;

public class DogResource {
    private String type;
    private Dog value;

    DogResource(Dog value, String type) {

        this.value = value;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dog getValue() {
        return value;
    }

    public void setValue(Dog value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof DogResource))
            return false;
        DogResource that = (DogResource) o;
        return Objects.equals(type, that.type) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        return "DogResource{" + "type='" + type + '\'' + ", value=" + value + '}';
    }
}
