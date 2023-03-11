package day08ternary_swich;

import java.util.Scanner;

public class Swich02_r {
    public static void main(String[] args) {

        /*
        If user enters 9 the code will print September, October, November, December
        If user enters 5 the code will print May, June, July, August, September, October, November,December

         */
        //2.22

         Scanner input=new Scanner(System.in);
        System.out.println("Give me number");
        byte monthnumber=input.nextByte();


        switch (monthnumber) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");

            case 5:
                System.out.println("May");

            case 6:
                System.out.println("June");

            case 7:
                System.out.println("July");
            case 8:
                System.out.println("Augustas");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter a valid month number, please..");


        }
    }
}