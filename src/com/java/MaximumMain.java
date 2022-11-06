package com.java;

public class MaximumMain {
    public static void main(String args[]) {

        findingMaxInteger();
        findingMaxFloat();

    }
    public static void findingMaxInteger() {
        System.out.println("\nFinding max integer.....................");
        Integer number1 = 10, number2 = 30, number3 = 200;
        if ((number3.compareTo(number2) > 0) && (number3.compareTo(number1) > 0))
            System.out.println(number3 + " greater than " + number2 + " and " + number1);
        else if ((number2.compareTo(number1) > 0) && (number2.compareTo(number3) > 0))
            System.out.println(number2 + " greater than " + number1 + " and " + number3);
        else if ((number1.compareTo(number2) > 0) && (number1.compareTo(number3) > 0))
            System.out.println(number1 + " greater than " + number2 + " and " + number3);
    }
    public static void findingMaxFloat() {
        System.out.println("\nFinding max Float.....................");
        Float number1= Float.valueOf(10);
        Float number2= Float.valueOf(80);
        Float number3= Float.valueOf(2);
        if((number3.compareTo(number2)>0)&&(number3.compareTo(number1)>0))
            System.out.println(number3+" greater than "+number2+" and "+number1);
        else if((number2.compareTo(number1)>0)&&(number2.compareTo(number3)>0))
            System.out.println(number2+" greater than "+number1+" and "+number3);
        else if((number1.compareTo(number2)>0)&&(number1.compareTo(number3)>0))
            System.out.println(number1+" greater than "+number2+" and "+number3);
    }

}