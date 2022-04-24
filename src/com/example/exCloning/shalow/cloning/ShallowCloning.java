package com.example.exCloning.shalow.cloning;
/**
 * Created by Vagharshak Grigoryan
 * */
public class ShallowCloning {
    public static void main(String[] args) {
        Group group = new Group(1);
        Student student = new Student("Vagharshak", 31, group);

        try {
            Student clonStudent = (Student) student.clone();
            System.out.println(student);
            System.out.println(clonStudent);
            clonStudent.setName("Robert");
            group.setId(10);
            System.out.println("After cloning");
            System.out.println(student);
            System.out.println(clonStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
