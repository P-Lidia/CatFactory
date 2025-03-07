package ru.plidia.factoryapp.entity;

import ru.plidia.factoryapp.service.RandomGeneration;

import java.util.concurrent.atomic.AtomicLong;

public class Cat implements Comparable<Cat> {
    private static AtomicLong nextId = new AtomicLong();
    private Long id;
    private int age;
    private int weight;
    private CatColour colour;

    public Cat() {
    }

    public Cat(int age, int weight, CatColour colour) {
        this.id = nextId.incrementAndGet();
        this.age = age;
        this.weight = weight;
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
        return sb.append("\n")
                .append("id ")
                .append(id)
                .append(": age - ")
                .append(age)
                .append(", weight - ")
                .append(weight)
                .append(", colour - ")
                .append(colour)
                .toString();
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }
}
