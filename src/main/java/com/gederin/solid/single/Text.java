package com.gederin.solid.single;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Text {
    private String text;

    public String convertToUpperCase(){
        return text.toUpperCase();
    }

    public boolean isContainsWord(String word){
        return text.contains(word);
    }
}
