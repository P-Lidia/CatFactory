package ru.plidia.factoryapp.service;

import ru.plidia.factoryapp.entity.CatColour;

public class RandomGeneration {

    public int generateInt() {
        return (int) (1 + Math.random() * 12);
    }

    public CatColour generateColour() {
        CatColour colour = CatColour.WHITE;
        int number = (int) (Math.random() * 100);
        if (number > CatColour.WHITE.getNumberCode()) {
            if (number <= CatColour.BLACK.getNumberCode()) {
                colour = CatColour.BLACK;
            } else if (number <= CatColour.GREY.getNumberCode()) {
                colour = CatColour.GREY;
            } else if (number <= CatColour.GINGER.getNumberCode()) {
                colour = CatColour.GINGER;
            }
        }
        return colour;
    }
}