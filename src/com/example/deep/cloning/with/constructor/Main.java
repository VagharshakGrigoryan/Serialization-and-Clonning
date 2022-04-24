package com.example.deep.cloning.with.constructor;
/**
 * Created by Vagharshak Grigoryan
 * */
public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student(31,"Vagharshak");
        Student cloneStudent = new Student(originalStudent);

        System.out.println(originalStudent);
        System.out.println(cloneStudent);
    }
}
