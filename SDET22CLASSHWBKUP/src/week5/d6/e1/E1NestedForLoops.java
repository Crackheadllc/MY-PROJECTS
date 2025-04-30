package org.example.week5.d6.e1;

public class E1NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] num = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
             for (int i = 0; i < num.length; i++){
                 for (int j = 0; j < num[i].length; j++){
                     if (num[i][j] % 2 == 0){
                         System.out.println(num[i][j]);
                     }
                 }
             }
                }
            }


        // Use nested loops to fill the 2D array with multiplication table values

        // Use nested loops to iterate through the 2D array and print the pattern


