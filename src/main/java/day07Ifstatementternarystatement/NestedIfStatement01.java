package day07Ifstatementternarystatement;

import java.util.Scanner;

public class NestedIfStatement01 {
    public static void main(String[] args) {

     //Example 1: If the worker is male and the age is greater than 65 he will be retired otherwise he should work
     //Example 1: If the worker is female and the age is greater than 60 she will be retired otherwise she should work
     //Example 1: If the worker does not define himself as male or female print "Undefined" on the console
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age gender like Male, Female, or Others");
        String gender = input.next();

        System.out.println("Enter your age...");
        byte age = input.nextByte();
        if (age<0){
            System.out.println("Invalid age");
        }

        if(gender.equalsIgnoreCase("Male")){
            if(age<0){
                System.out.println("Invalid age");

            } else if (age<66) {
                System.out.println("He should be retired");

            }else{
                System.out.println("He should be retired");
            }

        } else if (gender.equalsIgnoreCase("Female")) {
            if(age<0){
                System.out.println("Invalid age");


            } else if (age<61) {
                System.out.println("She should work");

            }else{
                System.out.println("Undefined");
            }

        }


    }
}
