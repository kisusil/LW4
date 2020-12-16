package com.example.thirdlab.spacesuit;

public class IceAx implements Tool {
    private String description = "Ледяной топор";

    @Override
    public void doWork() {
        System.out.println(description);
    }

    @Override
    public String toString() {
        return description;
    }
}
