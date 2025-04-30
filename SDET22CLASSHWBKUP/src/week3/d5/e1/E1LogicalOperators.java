package org.example.week3.d5.e1;

import java.util.Scanner;

public class E1LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you need a loan? (true/false)");

        boolean needsLoan = scan.nextBoolean();



        // Check if the user needs a loan

        // Use conditional statements to determine the user's loan eligibility based on their credit score:
        // Set eligibility to "Not eligible",if creditScore is below 600.
        // Set eligibility to "Maybe eligible",if creditScore is between 600 and 700 inclusive.
        // Set eligibility to "Eligible",if creditScore is between 701 and 800 inclusive.
        // Set eligibility to "Definitely eligible",if creditScore is higher than 800.
        // If needsLoan is false, set eligibility to "Unknown".
        // Print Eligibility
        // Print "The eligibility is ____" with the corresponding eligibility status
        if (needsLoan){
            System.out.println("What is your credit score?");
            Scanner input = new Scanner(System.in);
            int creditScore = scan.nextInt();

            if (creditScore<600){
                System.out.println("The eligibility is Not eligible");
            } else if (creditScore>=600 &&(creditScore<=700)) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (creditScore>=701 &&(creditScore<=800)) {
                System.out.println("The eligibility is Eligible");
            } else if (creditScore>=801) {
                System.out.println("The eligibility is Definitely eligible");
            }

            }else {
                System.out.println("The eligibility is Unknown");
            }

            scan.close();

        }

        }
