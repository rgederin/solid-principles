package com.gederin.solid.segregation;

import com.gederin.solid.segregation.interfaces.Movable;
import com.gederin.solid.segregation.interfaces.Toy;

import lombok.Setter;

@Setter
public class ToyCar implements Toy, Movable {
    private String color;
    private double price;

    @Override
    public void move() {
        System.out.println("ToyCar: Start moving car.");
    }

    @Override
    public String toString() {
        return "ToyCar: Moveable Toy car- Price: " + price + " Color: " + color;
    }
}