package com.example.deep.cloning.with.reflectioncopy;

import java.lang.reflect.Field;

public class MainRef {
    public static void main(String[] args) {
        Cow originalCow = new Cow("Milka", 5, 1);
        System.out.println("Original \n\t cow = " + originalCow);

        Cow copiedCow = reflectionCloning(originalCow);
        System.out.println("Copied \n\t cow = " + copiedCow);
    }

    private static Cow reflectionCloning(Cow originalCow) {
        try {
            Field name = Cow.class.getDeclaredField("name");
            Field head = Cow.class.getDeclaredField("head");
            Field age = Cow.class.getDeclaredField("age");

            name.setAccessible(true);
            head.setAccessible(true);
            age.setAccessible(true);

            name.set(originalCow, "Byrenka");
            head.set(originalCow, 2);
            age.set(originalCow, 10);


        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return originalCow;

    }
}
