package com.example.thirdlab.rocket;

public class Bed implements RocketStuff {
    private final String description = "Кровать";

    @Override
    public String toString() {
        return description;
    }
}
