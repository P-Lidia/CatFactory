package ru.plidia.factoryapp.entity;

public enum CatColour {
    WHITE(25),
    BLACK(50),
    GREY(75),
    GINGER(100),
    ;
    private final int numberCode;

    CatColour(int numberCode) {
        this.numberCode = numberCode;
    }

    public int getNumberCode() {
        return this.numberCode;
    }
}
