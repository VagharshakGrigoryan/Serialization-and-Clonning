package com.example.classWithoutImpliments;
import java.io.*;

/**
 * Created by Vagharshak Grigoryan
 * */

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Serialization_and_Clonning\\" +
                "src\\com\\example\\classWithoutImpliments\\file2.txt");
        Bmw car = new Bmw(1000,5000,"X6",new Engine(1500,"BMW")) ;

        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(car);

            Bmw newBMW = (Bmw) ois.readObject();
            System.out.println(newBMW);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
