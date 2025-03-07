package ru.plidia.factoryapp.entity;

import ru.plidia.factoryapp.service.RandomGeneration;

public class CatFactory {
    private static CatFactory instance;
    private final RandomGeneration randomGeneration = new RandomGeneration();

    private CatFactory() {
    }

    public static CatFactory getInstance() {
        if (instance == null) {
            instance = new CatFactory();
        }
        return instance;
    }

    public Cat createCat() {
        Cat cat = null;
        switch (randomGeneration.generateColour()) {
            case WHITE:
                cat = new Cat(randomGeneration.generateInt(), randomGeneration.generateInt(), CatColour.WHITE);
                break;
            case BLACK:
                cat = new Cat(randomGeneration.generateInt(), randomGeneration.generateInt(), CatColour.BLACK);
                break;
            case GREY:
                cat = new Cat(randomGeneration.generateInt(), randomGeneration.generateInt(), CatColour.GREY);
                break;
            case GINGER:
                cat = new Cat(randomGeneration.generateInt(), randomGeneration.generateInt(), CatColour.GINGER);
                break;
        }
        return cat;
    }
}
