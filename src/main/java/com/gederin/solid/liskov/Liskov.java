package com.gederin.solid.liskov;

public class Liskov {
    public static void main(String[] args) {
        DevicesWithEngines car = new Car();
        car.setName("Mazda");
        car.setSpeed(10);

        car.startMoving();
    }
}
