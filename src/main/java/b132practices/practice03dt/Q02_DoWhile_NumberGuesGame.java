package b132practices.practice03dt;

import java.util.Scanner;

public class Q02_DoWhile_NumberGuesGame {
/*
    Type a number guess game:
    Hint: Ask user to enter a number between 0-100
    Type a code that gives a random number between 0-100
    If the number is less than random number print: "Enter a greater number"
    If the number is more than random number print: "Enter a smaller number"
    If the number is equal to random number print: "Congratulations! You found the number!!!"

*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 0-100");
        int number;


        int randomNumber = (int)(Math.random()*101);

        do{
            number = scanner.nextInt();
            if (number<randomNumber){
                System.out.println("Enter a greater number");
            }else if(number>randomNumber){
                System.out.println("Enter a smaller number");
            }else{
                System.out.println("Congrations ! You find number. Bye bye byee");
            }

        }while(number!=randomNumber);
        System.out.println("Bye bye!!!");






    }




}
