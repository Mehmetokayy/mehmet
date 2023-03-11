package ssg11whiledowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        // ask the user to enter as many numbers as they want
        // if the sum of the numbers entered by the user exceeds 500
        // now you have entered enough numbers, the total is....

        Scanner scan = new Scanner(System.in);

        int number=0;
        int total=0;

        do {
            System.out.println("Please enter a number");
            number= scan.nextInt();
            total+=number;
        } while (total<=500);

        System.out.println("You have entered enough numbers now, the sum is: " +total+ "");



    }
}
