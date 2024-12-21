package ru.plidia.factoryapp.main;

import ru.plidia.factoryapp.entity.Cat;
import ru.plidia.factoryapp.entity.CatFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        CatFactory catFactory = CatFactory.getInstance();
        List<Cat> catList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            catList.add(catFactory.createCat(cat.getColour()));
        }
    }
}

