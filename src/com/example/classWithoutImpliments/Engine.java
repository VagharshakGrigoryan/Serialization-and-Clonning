package com.example.classWithoutImpliments;

import java.util.Objects;

public class Engine { //implements Serializable {

    private  int power;
    private String producer;

    public Engine() {
    }

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }


    public String getProducer() {
        return producer;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", producer='" + producer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engines = (Engine) o;
        return power == engines.power && Objects.equals(producer, engines.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, producer);
    }
}
