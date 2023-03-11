package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner02_r {
    public static void main(String[] args) {

     //   Example 1: Get shirtPrice and shoePrice from user and print the total price on the console

        Scanner inputOfMehmet = new Scanner(System.in);
        System.out.println("Give me shirt price please...");
        double shirtPrice = inputOfMehmet.nextDouble();
        System.out.println("Give me shoe price please...");
        double shoePrice = inputOfMehmet.nextDouble();

        System.out.println("(shoe and shirt Prices) = " + (shoePrice + shirtPrice));



    }
}
