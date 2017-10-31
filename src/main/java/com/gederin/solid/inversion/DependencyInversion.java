package com.gederin.solid.inversion;


public class DependencyInversion {
    public static void main(String[] args) {
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);

        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);

        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}
