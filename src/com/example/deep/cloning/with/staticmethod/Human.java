package com.example.deep.cloning.with.staticmethod;

import java.util.Objects;

public class Human {
    private int age;
    private String name;

    public Human() {
    }

    public static Human getHumanInstanceWithAgeAndString(int age, String name) {
        Human instance = new Human();
        instance.age = age;
        instance.name = name;

        return instance;

    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
