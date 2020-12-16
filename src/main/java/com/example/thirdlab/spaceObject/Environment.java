package com.example.thirdlab.spaceObject;


public interface Environment {
    void illuminate();

    EnvironmentColor getColor();
    void setColor(EnvironmentColor color);

    String getDescription();
    void setDescription(String description);
}
