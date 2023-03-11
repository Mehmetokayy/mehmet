package ssg;

import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {

        //Let's find out if an input character is a letter or not


        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a Charter");

        char character=scan.next().toUpperCase().charAt(0);
        System.out.println(character);



        if((character >='A'  &&  character<='Z')){
            System.out.println("enter character is letter ");
        }else {
            System.out.println("Enter character is not letter ");
        }






    }
}
