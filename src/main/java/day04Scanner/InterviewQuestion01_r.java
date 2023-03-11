package day04Scanner;

import java.util.Scanner;

public class InterviewQuestion01_r {
    public static void main(String[] args) {
       /*
        //Example 1: Get the initial of a name which contains first name and last name
        //      Tom Hanks ==>

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ...");

          String fullName = input.nextLine();  //

        char first = fullName.charAt(0);

        char last = fullName.split(" ")[1].charAt(0);
        System.out.println(first +" "+ last);
       */


        //Example1: Type code to swap two integers
        //         a=12 and b=5 ==> a=5 and b=12

        int a=12;
        int b=5;

        System.out.println(a+" " + b);
        int temp=0;
        //1. Step:
        temp=a;

        //2.Step:
        a=b;

        //3.Step:
        b=temp;

        System.out.println(a+" " + b);


        //2.Way: do not create 3rd variable.

        int x=12;
        int y=5;
        System.out.println("Before swapping" + x + " "+y);
        x=x+y;

        y=x-y;

        x=x-y;

        System.out.println("After swapping" + x +" "+y);




    }
}
