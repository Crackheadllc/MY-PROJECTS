package org.example.week4.d5.e8;

import java.util.Scanner;

public class E8ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);
        System.out.print("In: ");
        int x = scanner.nextInt();

        for (int i = x - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
