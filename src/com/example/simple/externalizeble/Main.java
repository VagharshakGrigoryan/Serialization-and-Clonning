package com.example.simple.externalizeble;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1,"Vagharshak");
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Serialization_and_Clonning\\src\\" +
                "com\\example\\simple\\externalizeble\\external.txt");
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(teacher);
            teacher = (Teacher) ois.readObject();
            System.out.println(teacher);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

