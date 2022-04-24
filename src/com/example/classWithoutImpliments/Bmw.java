package com.example.classWithoutImpliments;

import java.io.*;
import java.util.Objects;

public class Bmw extends Car implements Serializable {

    private int price;
    private String model;
    private transient Engine engine;

    public Bmw() {
    }

    public Bmw(int weight, int price, String model, Engine engine) {
        super(weight);
        this.price = price;
        this.model = model;
        this.engine = engine;
        System.out.println("Child constructor");
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeInt(engine.getPower());
            oos.writeObject(engine.getProducer());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            this.engine = new Engine(ois.readInt(), (String) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", engine=" + engine + ",weight=" + getWeight() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bmw bmw = (Bmw) o;
        return price == bmw.price && Objects.equals(model, bmw.model) && Objects.equals(engine, bmw.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model, engine);
    }
}
