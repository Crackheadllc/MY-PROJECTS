package org.example.week2.d6.e4;

public class E4ElseIf {
    public static void main(String[] args) {

        String operator = "*";
        // Create two variables num1 and num2
        double num1 = 5;
        double num2 = 10;


        // create a variable to hold the operator
        var result = num1 * num2;

        // Perform operation using if-else if-else conditions
        if ( operator == "+" ) {
            System.out.println("The sum is: " + result);
        } else if ( operator == "-" ) {
            System.out.println("The difference is: " + result);
        } else if ( operator == "*" ) {
            System.out.println("The product is: " + result);
        } else if ( operator == "/" ) {
            System.out.println("The quotient is: " + result);
        } else if ( operator == operator ) {
            System.out.println("Invalid operator");
        }
    }
}
