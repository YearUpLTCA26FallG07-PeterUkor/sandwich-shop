package com.pluralsight;

import java.util.Scanner;

public class sandwichShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for visiting our Sandwich Shop");
        System.out.print("""
                What sandwich side do you want?
                1: Regular: base price $5.45
                2: Large: base price $8.95
                """);
        System.out.print("Your Choice: ");
        String sandwichChoice = input.nextLine();

        System.out.print("What is your age: ");
        int age = input.nextInt();

        double sandwichPrice = 0;

        // confirm choice and set  price
        if (sandwichChoice.equals("1") || sandwichChoice.equals("Regular")){
            sandwichPrice = 5.45;
        } else if (sandwichChoice.equals("2") || sandwichChoice.equals("Large")) {
            sandwichPrice = 8.95;
        } else {
            System.out.println("Enter a valid choice.");
            return;
        }

        double discountPrice = 0;
        // calculate discount
        if (age <= 17) {
            discountPrice = sandwichPrice * 0.1;
        } else if (age >= 65) {
            discountPrice = sandwichPrice * 0.2;
        }
        // add the discount
        sandwichPrice -= discountPrice;

        System.out.printf("Your price is %.2f%n", sandwichPrice);
    }
}
