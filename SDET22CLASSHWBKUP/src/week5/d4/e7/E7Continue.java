package org.example.week5.d4.e7;

public class E7Continue {
    public static void main(String[] args) {
        String[] inventory = {"Item1", "Out of Stock", "Item2", "Item3", "Out of Stock", "Item4"};

        // Enhanced for loop to iterate through the items
        for (String item: inventory){
            if ("Out of Stock".equals(item)){
                continue;
            }
            System.out.println("Processing " +item);
        }

        // If the current item is "Out of Stock", skip the current iteration using continue

        // If the item is in stock, print the message for processing the item
    }
}
