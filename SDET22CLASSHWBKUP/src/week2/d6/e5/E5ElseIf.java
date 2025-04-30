package org.example.week2.d6.e5;

public class E5ElseIf {
    public static void main(String[] args) {
        // Declare a string variable and assign a value
        String animal= "dog";

        // Use if-else-if conditions to classify the animal
        if (animal=="dog"){
            System.out.println("The animal is a mammal.");
        } else if(animal=="eagle") {
            System.out.println("The animal is a bird.");
        } else if(animal=="shark") {
            System.out.println("The animal is a fish.");
        } else if(animal=="frog") {
            System.out.println("The animal is an amphibian.");
        } else if (animal=="snake") {
            System.out.println("The animal is a reptile.");
        } else if (animal==animal) {
            System.out.println("Unknown animal type.");
        }

        // If animal is "dog", print: The animal is a mammal.

        // If animal is "eagle", print: The animal is a bird.

        // If animal is "shark", print: The animal is a fish.

        // If animal is "frog", print: The animal is an amphibian.

        // If animal is "snake", print: The animal is a reptile.

        // If animal does not match any of the above, print: Unknown animal type.

    }
}