package ru.plidia.factoryapp.main;

import ru.plidia.factoryapp.entity.Cat;
import ru.plidia.factoryapp.entity.CatColour;
import ru.plidia.factoryapp.entity.CatFactory;
import ru.plidia.factoryapp.service.RandomGeneration;
import ru.plidia.factoryapp.util.Print;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        CatFactory catFactory = CatFactory.getInstance();
        Print print = new Print();
        List<Cat> catList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            catList.add(catFactory.createCat());
        }
        print.printCats(catList);
        Collections.sort(catList);
       print.printSortCats(catList);
    }
}

