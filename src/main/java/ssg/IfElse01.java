package ssg;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {

     //Gunduz dersimiz varsa katilabilirim
     //Gece sinifimiz varsa ona katilabilirim

        boolean dt=true;
        boolean nt=false;

        if(dt ||nt){
            System.out.println("You can join class");
        }else{
            System.out.println("I can not join the class!");

        }

        // Check given characters, letter or not?


        Scanner input =new Scanner(System.in);
        System.out.println("Type character please...");

        char character=input.next().toUpperCase().charAt(0);

        if(character>'A' && character<'Z'){
            System.out.println("The character is letter");
        }else{
            System.out.println("The character is not letter");
        }



        String maho="koylu";

        System.out.println(maho);

    }
}
