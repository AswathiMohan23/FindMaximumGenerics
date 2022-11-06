package com.java;

public class MaximumMain<T> {
    public static void main(String args[]) {

        findingMaxInteger();
        findingMaxFloat();
        findingMaxString();

    }
    static Generics<Integer> object = new Generics<>();

    public static void findingMaxInteger() {
        System.out.println("\nFinding max integer.....................");
        //object number1 = 10, number2 = 30, number3 = 200;
        object.comparing(10, 30, 200);
    }

    public static void findingMaxFloat() {
        System.out.println("\nFinding max Float.....................");
        Float number1 = Float.valueOf(10);
        Float number2 = Float.valueOf(80);
        Float number3 = Float.valueOf(2);
        object.comparing(number1, number2, number3);
    }
    public static void findingMaxString() {
        System.out.println("\nFinding the longest string.....................");
        String firstValue = "banana", secondValue = "watermelon", thirdValue = "apple";
        object.comparing(firstValue, secondValue, thirdValue);
    }

}