package day04Scanner;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {

        //Example 1: Get the full name of user and make all characters in upper case.
        //

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name and last name");

        String fullName=input.nextLine().toUpperCase();
        //toUpperCase() converts all characters to upper cases.

        System.out.println(fullName);

        //Example 2: Get the full name of the user, make all characters in upper cases and remove spaces
        //from the beginning and from the end

        System.out.println("Enter your first name and last name");
        String name=input.nextLine().toUpperCase().trim();
        System.out.println(name);

        //trim() remove the "space" caharacters from the beginning and from the end.
        //trim() does not touch spaces in the middle


        //Example 3: Get a String from user, then count the number of the characters in the String
        System.out.println("Enter a String...");

        String s= input.nextLine();
        int numOfChars = s.length(); //length() gives you the total number of characters in a String

        System.out.println(numOfChars);









    }
}
