package org.example.week3.d5.e5;

import java.util.Scanner;

public class E5LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter their mark
        System.out.println("Please enter your mark");

        // Capture the mark input
        int marks = scanner.nextInt();

        // Determine the grade based on the mark
        if (marks>=1 && (marks<=25)){
            System.out.println("Your grade is F");
            
        } else if (marks>=26 &&(marks<=45)) {
            System.out.println("Your grade is E");

        } else if (marks>=46 &&(marks<=50)) {
            System.out.println("Your grade is D");

        } else if (marks>=51 &&(marks<=60)) {
            System.out.println("Your grade is C");

        } else if (marks>=61 &&(marks<=80)) {
            System.out.println("Your grade is B");

        } else if (marks>=80) {
            System.out.println("Your grade is A");

        } else if (marks<0 || marks>100 ) {
            System.out.println("Please enter a valid mark");
        }

        scanner.close();
    }


        // Print the grade
        // Output: Your grade is ____


    }
