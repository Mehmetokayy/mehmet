package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner06_r {
    public static void main(String[] args) {

        //Example 1: Ask user to enter his first and last name and address then print them on the console.

        Scanner input =new Scanner(System.in);

        System.out.println("Enter your address please ...");
        String address   = input.next();

        System.out.println("Enter your first name please ...");
               String firstName   = input.next();  //Next get first word

        System.out.println("Enter your last name please ...");
        String  laststName   = input.nextLine(); //Nextline use all words(getting all character)



        System.out.println(firstName +""+ laststName);
        System.out.println(address);

    }
}
