package ru.plidia.factoryapp.entity;

public class CatFactory {
    private static CatFactory instance;

    private CatFactory() {
    }

    public static CatFactory getInstance() {
        if (instance == null) {
            instance = new CatFactory();
        }
        return instance;
    }

    public Cat createCat(CatColour colour) {
        Cat cat = null;
        switch (colour) {
            case WHITE:
                cat = new Cat(2, 8, CatColour.WHITE);
                break;
            case BLACK:
                cat = new Cat(2, 8, CatColour.BLACK);
                break;
            case GREY:
                cat = new Cat(2, 8, CatColour.GREY);
                break;
            case GINGER:
                cat = new Cat(2, 8, CatColour.GINGER);
                break;
        }
        return cat;
    }
}
