package com.example.deep.cloning.with.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Cow implements Serializable {
    private String name;
    private int weight;
    private int age;

    public Cow() {
    }

    public Cow(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return weight == cow.weight && age == cow.age && Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, age);
    }
}
