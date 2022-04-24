package com.example.classWithoutImpliments;

import java.io.Serializable;
import java.util.Objects;

abstract class Car implements Serializable{


    private int weight;

    public Car() {
        System.out.println("Parent constructor");
    }

    public Car(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}
