package com.java;

public class MaximumMain {
    public static void main(String args[]) {

        findingMaxInteger();
        findingMaxFloat();
        findingMaxString();

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
    public static void findingMaxString() {
        System.out.println("\nFinding the longest string.....................");
        String string1="banana",string2="watermelon",string3="apple";
        if((string3.compareTo(string2)>0)&&(string3.compareTo(string1)>0))
            System.out.println(string3+" String is longer than the strings "+string2+" and "+string1);
        else if((string2.compareTo(string1)>0)&&(string2.compareTo(string3)>0))
            System.out.println(string2+" String is longer than the strings "+string1+" and "+string3);
        else if((string1.compareTo(string2)>0)&&(string1.compareTo(string3)>0))
            System.out.println(string1+" String is longer than the strings "+string2+" and "+string3);
    }

}