package ssg11whiledowhileloop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

// Select  a number between 1 and 100 to the computer
        // ask the user to guess this number
        // guide the user to large or small the number in each guess entered
        // when the user finds the number, print to the user how many guesses he found the number



        Random rnd=new Random();
// int number=rnd.nextInt(50); // this generates a random number less than 100

        int number=rnd.nextInt(50);
        Scanner scan = new Scanner(System.in);
        int guess=0;
        int counter=1;

        while (number != guess){
            System.out.println("Please enter a number");
            guess=scan.nextInt();

            if (guess>number){
                System.out.println("You should say a smaller number");

            } else if (guess<number){
                System.out.println("You should say a larger number");

            }
            counter++;
        }
        System.out.println("You find my number " + (counter-1) + " guessed");









    }
}
