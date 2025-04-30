package org.example.week5.d4.e3;

public class E3EnhancedForLoop {
    public static void main(String[] args) {
        // Declare and initialize the array with integer values
        int[] numbers = {12, 23, 34, 45, 56, 67, 78, 89, 90};

        // Enhanced for loop to iterate through the array

        // If the current number is greater than 80, break the loop
        for (int number:numbers){
            if (number>80){
                break;
            }
            System.out.println(number);
        }

        // Print the current number before the loop breaks


    }
}
