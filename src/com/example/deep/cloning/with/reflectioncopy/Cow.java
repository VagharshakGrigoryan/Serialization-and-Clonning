package com.example.deep.cloning.with.reflectioncopy;

import java.util.Objects;

public class Cow {
    private String name;
    private int age;
    private int head;

    public Cow() {
    }

    public Cow(String name, int age, int head) {
        this.name = name;
        this.age = age;
        this.head = head;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", head=" + head +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return age == cow.age && head == cow.head && Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, head);
    }
}
