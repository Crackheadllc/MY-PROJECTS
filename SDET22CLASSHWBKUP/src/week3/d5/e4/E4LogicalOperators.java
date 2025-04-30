package org.example.week3.d5.e4;

import java.util.Scanner;

public class E4LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner =new Scanner(System.in);

        // Print prompt for user to answer if it is the weekend
        System.out.println("Is it weekend? (true/false)");
        // Capture the weekend input
        boolean isWeekend= scanner.nextBoolean();

        System.out.println("Are you available? (true/false)");
        boolean isAvailable = scanner.nextBoolean();

        // Determine the subject based on the input
        // If it is the weekend
        if (isWeekend &&(isAvailable)){
            System.out.println("Today you will be learning Java");

        } else if (!isWeekend &&(isAvailable)) {
            System.out.println("Today you will be learning manual testing");

        }else {
            System.out.println("Today you will be learning no subject");
        }

        scanner.close();
        //    Set subject to "Java"
        // Otherwise
        //    Set subject to "manual testing"

        // Print the subject suggestion
        // Output: Today you will be learning ____


    }
}
