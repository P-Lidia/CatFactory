package ru.plidia.factoryapp.service;

import ru.plidia.factoryapp.entity.Cat;
import ru.plidia.factoryapp.entity.CatColour;

public class RandomGeneration {
    public static int generate(int number) {
        return (int) (1 + Math.random() * 15);
    }

    public static CatColour generateColour(CatColour colour) {
        int number = (int) (Math.random() * 100);
        if (number <= CatColour.WHITE.getNumberCode()) {
           colour = CatColour.WHITE;
        } else if (number <= CatColour.BLACK.getNumberCode()) {
            colour = CatColour.BLACK;
        } else if (number <= CatColour.GREY.getNumberCode()) {
            colour = CatColour.GREY;
        } else if (number <= CatColour.GINGER.getNumberCode()) {
            colour = CatColour.GINGER;
        }
        return colour;
    }
}