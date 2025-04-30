package org.example.week5.d6.e2;

public class E2NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = {
                {3, 5, 2},
                {1, 4, 7},
                {6, 0, 9}

        };
          for (int i=0; i<table.length; i++){
              int rowTable = 0;
              for (int j=0; j<table.length; j++){
                  rowTable += table[i][j];
              }
              System.out.println("Sum of row " + (i + 1) + ": " + rowTable);
          }

        // Use nested loops to fill the 2D array with multiplication table values

        // Use nested loops to iterate through the 2D array and print the pattern

    }
}
