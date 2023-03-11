package ssg;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

   int number=101;

        System.out.println( number >100 ? number*number : "number should be bigger than 100");


        Scanner input = new Scanner(System.in);
        System.out.println("Give me number please...");
        int number1=input.nextInt();

        System.out.println(number1%2==0 ? "The number is even" : "The number is odd");



















    }
}
