package ru.plidia.factoryapp.service;

public class RandomGeneration {
    public static int generate(int number) {
        return (int) (1 + Math.random() * 15);
    }


}