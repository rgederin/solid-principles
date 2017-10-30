package com.gederin.solid.segregation;

import com.gederin.solid.segregation.interfaces.Toy;

import lombok.Setter;

@Setter
public class ToyHouse implements Toy {

    private String color;
    private double price;

    @Override
    public String toString() {
        return "ToyHouse: Toy house- Price: " + price + " Color: " + color;
    }
}