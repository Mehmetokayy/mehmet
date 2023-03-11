package ssg08ifelseandnestedifstaement;

import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {
        //Let's find out if an input character is a letter or not

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Charterer ");

        char ch=input.next().toUpperCase().charAt(0);
        System.out.println(ch);
        if((ch>='A'  &&  ch<='Z')) {
            System.out.println("Character is letter");
        }else{
            System.out.println("Character is not letter");
        }






    }
}
