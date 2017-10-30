package com.gederin.solid.single;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextPrinter {
    private Text text;

    public void printText(){
        System.out.println(text.getText());
    }
}
