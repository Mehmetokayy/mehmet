package day07Ifstatementternarystatement;

import java.util.Scanner;

public class IfStatement02_r {
    public static void main(String[] args) {
        //Example 1: Get user's age
        //          0-4 ==> Baby  - 5-12 ==> Kid  - 13-18 ==>Teenager   -  20-30 ===> Adult
        //         Other ==> Undefined  - Negative ages ==> Invalid age

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your age..");
        byte age =input.nextByte();

        if(age<0){
            System.out.println("Invalid age..,");

        } else if (age<5) {
            System.out.println("Baby");

        } else if (age<13) {
            System.out.println("Kid");
        } else if (age<19) {
        System.out.println("Teenager");
        } else if (age<31) {
            System.out.println("Adult");
        } else {
            System.out.println("Undefined");
        }

    }
}
