package com.example.simple.serailization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("Java");
        Student student = new Student(1,"Vagharshak");

        student.setGroup(group);
        group.setStudent(student);
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Serialization_and_Clonning\\src" +
                "\\com\\example\\simple\\serailization\\file.txt");
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(student);
            student = (Student) ois.readObject();
            System.out.println(student);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
