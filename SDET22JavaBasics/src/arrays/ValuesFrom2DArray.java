package arrays;

public class ValuesFrom2DArray {
    public static void main(String[] args) {


        int[][] numbers = {
                {1, 2, 3}, //1ST array or 1st Row //INDEX 0
                {10, 20, 30, 40, 50}, //2ND Array or 2nd Row //INDEX 1
                {100, 200}  //3RD Array or 3rd Row //INDEX 2
        };

        for (int[] myNumbers:numbers){ //outer loop iterates over each 1D array

            for (int num: myNumbers){

                System.out.print(num +" ");
            }
            System.out.println();
        }

        String[][] countries={
                {"USA", "Canada"},
                {"Peru", "Brazil", "Argentina"},
                {"France", "Italy", "Portugal", "Belgium", "Germany"},
                {"Japan", "South Korea"}
        };

        for (String[] countryArray:countries){ //outer loop iterates over each 1D array

            for (String country:countryArray){ //inner loop iterates over each element from 1D array

                System.out.print(country+" ");
            }
            System.out.println();

        }
    }
}
