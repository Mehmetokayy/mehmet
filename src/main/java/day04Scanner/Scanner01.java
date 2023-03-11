package day04Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Examble 1: Get the initial of a name which contains first name and last name
        //       Tom Hanks ==> TH

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name and last name, please");

        String fullName = input.nextLine(); //Tom Hanks

       char first =fullName.charAt(0);    //Indexes start with"0" Tom Hanks has (01234567) index

        char last = fullName.split(" ")[1].charAt(0);

        System.out.println(first +" " + last);


    }
}
