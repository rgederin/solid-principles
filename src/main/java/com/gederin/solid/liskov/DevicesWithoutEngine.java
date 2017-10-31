package com.gederin.solid.liskov;

public class DevicesWithoutEngine extends TrasportationDevice {

    void startMoving() {
        System.out.println("start moving device " + getName() + " with " + getSpeed() + " km/h");
    }
}
