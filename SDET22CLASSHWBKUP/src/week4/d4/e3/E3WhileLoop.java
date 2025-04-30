package org.example.week4.d4.e3;

public class E3WhileLoop {
    public static void main(String[] args) {
        // Declare a counter variable and set it to 1
        int i = 1;

        // Use a while loop to print even numbers from 1 to 13
        while (i <= 13) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        // Inside the loop, use an if statement to check if counter is even
        // If counter is even, print the value of counter
        // Increment the counter by 1
    }
}

