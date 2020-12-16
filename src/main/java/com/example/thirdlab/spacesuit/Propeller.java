package com.example.thirdlab.spacesuit;

public class Propeller implements Tool {
    private String description = "Пропеллер";

    @Override
    public void doWork() {
        System.out.println(description);
    }

    @Override
    public String toString() {
        return description;
    }
}
