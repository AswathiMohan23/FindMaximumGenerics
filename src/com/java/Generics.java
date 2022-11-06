package com.java;

public class Generics <T extends Comparable<T>> {
    T firstValue;
    T secondValue;
    T thirdValue;

    public void Generics(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;

    }


    public <T extends Comparable> Object comparing(T firstValue, T secondValue, T thirdValue) {
        if ((thirdValue.compareTo(secondValue) > 0) && (thirdValue.compareTo(firstValue) > 0))
            System.out.println(thirdValue + " greater than " + secondValue + " and " + firstValue);
        else if ((secondValue.compareTo(firstValue) > 0) && (secondValue.compareTo(thirdValue) > 0))
            System.out.println(secondValue + " greater than " + firstValue + " and " + thirdValue);
        else if ((firstValue.compareTo(secondValue) > 0) && (firstValue.compareTo(thirdValue) > 0))
            System.out.println(firstValue + " greater than " + secondValue + " and " + thirdValue);
        return null;
    }

}
