package com.gederin.solid.inversion;

public class ElectricPowerSwitch implements Switch {
    private final Switchable client;
    private boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            on = false;
        } else {
            client.turnOn();
            on = true;
        }
    }
}