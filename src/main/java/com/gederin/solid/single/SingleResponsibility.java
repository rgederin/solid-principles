package com.gederin.solid.single;


public class SingleResponsibility {
    public static void main(String[] args) {
        Text text = new Text("Some text");
        TextPrinter textPrinter = new TextPrinter(text);

        textPrinter.printText();
    }
}
