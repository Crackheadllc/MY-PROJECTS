package arrays;

import java.util.Arrays;

public class AllValuesFrom2DArrays {
    public static void main(String[] args) {


        int[][] numbers = {
                {1, 2, 3}, //1ST array or 1st Row //INDEX 0
                {10, 20, 30, 40, 50}, //2ND Array or 2nd Row //INDEX 1
                {100, 200}  //3RD Array or 3rd Row //INDEX 2
        };

        System.out.println(numbers.length); //Return numbers of 1D arrays or numbers of rows
        System.out.println(numbers[2].length); //returns numers of elements from 1D arrays or numbers of cells from the rows

        for (int r = 0; r < numbers.length; r++) {

            for (int c = 0; c < numbers[r].length; c++) {

                System.out.print(numbers[r][c] + " ");
            }
            System.out.println();
        }
    }
}
