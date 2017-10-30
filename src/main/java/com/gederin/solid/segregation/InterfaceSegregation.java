package com.gederin.solid.segregation;

public class InterfaceSegregation {

    public static void main(String[] args) {
        System.out.println(buildToyHouse());

        System.out.println(buildToyCar());

        System.out.println(buildToyPlane());
    }

    private static ToyHouse buildToyHouse() {
        ToyHouse toyHouse = new ToyHouse();

        toyHouse.setPrice(15.00);
        toyHouse.setColor("green");

        return toyHouse;
    }

    private static ToyCar buildToyCar() {
        ToyCar toyCar = new ToyCar();

        toyCar.setPrice(25.00);
        toyCar.setColor("red");

        toyCar.move();

        return toyCar;
    }

    private static ToyPlane buildToyPlane() {
        ToyPlane toyPlane = new ToyPlane();

        toyPlane.setPrice(125.00);
        toyPlane.setColor("white");

        toyPlane.move();
        toyPlane.fly();

        return toyPlane;
    }
}
