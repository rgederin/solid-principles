package com.gederin.solid.liskov;

public class DevicesWithEngines extends TrasportationDevice {
    private boolean isEngineStarted;

    public void startEngine() {
        isEngineStarted = true;
    }

    void startMoving() {
        if (isEngineStarted) {
            System.out.println("start moving device " + getName() + "with " + getSpeed() + " km/h");
        } else {
            System.out.println("this kind of devices can not move without starting engine");
        }
    }

}
