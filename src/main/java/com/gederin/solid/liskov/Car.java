package com.gederin.solid.liskov;

import lombok.Data;

@Data
public class Car extends DevicesWithEngines {
    private int numberOfDoors;

    @Override
    public void startMoving() {
        startEngine();
        super.startMoving();
    }
}
