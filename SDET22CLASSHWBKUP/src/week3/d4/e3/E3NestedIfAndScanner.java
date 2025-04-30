package org.example.week3.d4.e3;

import java.util.Scanner;

public class E3NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Print prompt for user to enter gender

        System.out.println("Please enter your gender: M or F");
        String gender= sc.next();

        System.out.println("Please enter your age");
        int age = sc.nextInt();

        if (age>25) {
            if ( gender.equalsIgnoreCase("F")){
                System.out.println("Woman");
            } else if (gender.equalsIgnoreCase("M")){
                System.out.println("Man");

            } else {
                System.out.println("Invalid gender input");
            }
        } else {
            if ( gender.equals("F") ) {
                System.out.println("Girl");

            } else if ( gender.equals("M") ) {
                System.out.println("Boy");

            } else {
                System.out.println("Invalid gender input");

                sc.close();
            }
        }
    }
}


