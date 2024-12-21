package ru.plidia.factoryapp.entity;

import ru.plidia.factoryapp.service.RandomGeneration;

import java.util.concurrent.atomic.AtomicInteger;

public class Cat {
    static AtomicInteger nextId = new AtomicInteger();
    private Long id;
    private int age;
    private int weight;
    private CatColour colour;

    public Cat() {
    }

    public Cat(int age, int weight, CatColour colour) {
        this.id = (long) nextId.incrementAndGet();
        this.age = RandomGeneration.generate(age);
        this.weight = RandomGeneration.generate(weight);
        this.colour = colour;
    }

    public Long getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setColour(CatColour colour) {
        this.colour = colour;
    }

    public CatColour getColour() {
        return colour;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(id).append(age).append(weight).append(colour).toString();
    }
}
