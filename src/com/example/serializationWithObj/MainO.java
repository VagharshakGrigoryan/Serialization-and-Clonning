package com.example.serializationWithObj;


import java.io.*;

/**
 * Created by Vagharshak Grigoryan
 * */

public class MainO {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Serialization_and_Clonning" +
                "\\src\\com\\example\\serializationWithObj\\file1.txt");
        Car car = new Car(75000, "Hummer", new Engine(4800));
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(car);

            Car newCar = (Car) ois.readObject();
            System.out.println(newCar);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
