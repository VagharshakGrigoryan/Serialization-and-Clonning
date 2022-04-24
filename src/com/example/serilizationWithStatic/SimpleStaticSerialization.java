package com.example.serilizationWithStatic;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Vagharshak Grigoryan
 * */

public class SimpleStaticSerialization implements Serializable {
    private static int staticNumber;
    private int nonStaticNumber;

    public SimpleStaticSerialization() {
    }

    public static void serializeStatic (ObjectOutputStream oos){
        try {
            oos.writeInt(staticNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deSerializeStatic (ObjectInputStream ois){
        try {
            staticNumber = ois.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SimpleStaticSerialization(int nonStaticNumber) {
        this.nonStaticNumber = nonStaticNumber;
        staticNumber = nonStaticNumber;
    }

    @Override
    public String toString() {
        return staticNumber + " " + nonStaticNumber;
    }
}
