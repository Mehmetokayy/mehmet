package ssg;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Give me number a please...");
        int number=input.nextInt();


        System.out.println( number%2==0 ? "Even" : "Odd");












    }
}
