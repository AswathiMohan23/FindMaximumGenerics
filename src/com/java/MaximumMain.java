package com.java;

public class MaximumMain<T> {
    public static void main(String args[]) {

        findingMaxInteger();
        findingMaxFloat();
        findingMaxString();

    }
    static Generics<Integer> object = new Generics<>();

    public static void findingMaxInteger() {
        System.out.println("\ninteger Sorted in ascending order.....................");
        //object number1 = 10, number2 = 30, number3 = 200;
        object.comparing(10, 30, 200,300);
    }

    public static void findingMaxFloat() {
        System.out.println("\nFloat Sorted in ascending order.....................");
        Float number1 = Float.valueOf(10);
        Float number2 = Float.valueOf(80);
        Float number3 = Float.valueOf(2);
        Float number4 = Float.valueOf(90);
        object.comparing(number1, number2, number3,number4);

    }



    public static void findingMaxString() {
        System.out.println("\nSorted in ascending order.....................");
        String firstValue = "banana", secondValue = "watermelon", thirdValue = "apple",fourthValue="plum";
        object.comparing(firstValue, secondValue, thirdValue,fourthValue);
    }

}