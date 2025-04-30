package org.example.week4.d6.e2;

public class E2Arrays {
    public static void main(String[] args) {
        // Create an array of integers and store the values 45, 78, 12, 67, 55, 89, 23, 77, and 88
        int[] num = {45, 78, 12, 67, 55, 89, 23, 77, 88};


        for (int i = 0; i < num.length; i += 2) {
            System.out.print(num[i] + " ");


            // Use a loop to iterate through the array and print the values at even indices followed by a space

        }
    }
}
