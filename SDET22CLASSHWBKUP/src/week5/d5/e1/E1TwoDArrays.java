package org.example.week5.d5.e1;

public class E1TwoDArrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(num[row][col]);
                if (col<2){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    }
