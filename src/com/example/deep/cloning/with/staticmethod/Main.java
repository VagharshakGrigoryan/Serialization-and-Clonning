package com.example.deep.cloning.with.staticmethod;

public class Main {
    public static void main(String[] args) {
        //1st example
        Human cloneHuman = Human.getHumanInstanceWithAgeAndString(20,"Robert");
        System.out.println(cloneHuman);

        //2nd example
        Car car = new Car(2550,"Audi");
        System.out.println("Original \n\t car = " + car);

        Car copiedCar = Car.deepCopingCar(car);
        System.out.println("Copied \n\t car = " +  copiedCar);
    }
}
