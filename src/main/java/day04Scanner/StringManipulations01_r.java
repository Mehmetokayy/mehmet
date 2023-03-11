package day04Scanner;

import java.util.Scanner;

public class StringManipulations01_r {
    public static void main(String[] args) {



      //Example 1: Get the full name of the user and make all character in upper case
        //

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name and last name...");

        String fullName= input.nextLine().toLowerCase();

        System.out.println(fullName);


        //Example 2:Get the full name of the user, make all characters in upper cases and remove spaces from
        // the beginning and from the end

        System.out.println("Enter your first name and last name...");
        String name = input.nextLine().toUpperCase().trim(); // trim removes the "space" characters from the beginning
        System.out.println(name);                            //and from the end. Trim() does not touch in the middle


        //Example 3: Get a String from user, then count the number of the characters in the String

        System.out.println("Enter a string...");

        String s=input.nextLine();
        int numOfChars=s.length();

        System.out.println(numOfChars);







    }
}
