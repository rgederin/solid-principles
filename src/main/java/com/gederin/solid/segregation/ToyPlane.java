package com.gederin.solid.segregation;

import com.gederin.solid.segregation.interfaces.Flyable;
import com.gederin.solid.segregation.interfaces.Movable;
import com.gederin.solid.segregation.interfaces.Toy;

import lombok.Setter;

@Setter
public class ToyPlane implements Toy, Movable, Flyable {
    private String color;
    private double price;

    @Override
    public void move() {
        System.out.println("ToyPlane: Start moving plane.");
    }

    @Override
    public void fly() {
        System.out.println("ToyPlane: Start flying plane.");
    }

    @Override
    public String toString() {
        return "ToyPlane: Moveable and flyable toy plane- Price: " + price + " Color: " + color;
    }
}