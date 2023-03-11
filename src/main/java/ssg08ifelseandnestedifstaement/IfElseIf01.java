package ssg08ifelseandnestedifstaement;

import java.util.Scanner;

public class IfElseIf01 {
    public static void main(String[] args) {

      //Ask the user for a grade system of 100.
      //check the grade system.
      //"D" if less than 50,
      //=50 <60 "C"
      //=60<80 between "B",
      //"A" if greater than 80;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Grade");
        double grade=input.nextDouble();


        if (grade<0|| grade>=100){
            System.out.println("Please Enter a valid point ");
        } else if (grade<51 ) {
            System.out.println("D");
        } else if (grade<60) {
            System.out.println("C");
        } else if (grade<80) {
            System.out.println("B");
        }else{
            System.out.println("A");
        }


    }
}
