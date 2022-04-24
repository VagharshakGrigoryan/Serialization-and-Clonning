package com.example.serilizationWithStatic;


import java.io.*;

public class Dispatcher {
    public static void main(String[] args) {
        SimpleStaticSerialization s = new SimpleStaticSerialization(10);
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Serialization_and_Clonning" +
                "\\src\\com\\example\\serilizationWithStatic\\text.txt");
        System.out.println("First serialization \n\t values + " + s);
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            SimpleStaticSerialization.serializeStatic(oos);
            oos.writeObject(s);

            s = new SimpleStaticSerialization(30);
            System.out.println(" After serialization \n\t values + " + s );

            SimpleStaticSerialization.deSerializeStatic(ois);
            s = (SimpleStaticSerialization) ois.readObject();

            System.out.println("After deserialization \n\t values+ " + s);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
