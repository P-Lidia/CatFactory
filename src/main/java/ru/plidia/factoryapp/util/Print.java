package ru.plidia.factoryapp.util;

import ru.plidia.factoryapp.entity.Cat;

import java.util.List;

public class Print {
    public void printCats(List<Cat> catList) {
        System.out.println("Cats:\n" + catList);
    }

    public void printSortCats(List<Cat> catList) {
        System.out.println("\nCats sorting by age:\n" + catList);
    }
}
