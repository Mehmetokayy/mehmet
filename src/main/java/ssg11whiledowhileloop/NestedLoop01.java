package ssg11whiledowhileloop;

public class NestedLoop01 {
    public static void main(String[] args) {

// Write a program that prints the below figure without a nested loop.
        /*
                * * * * *
                * * * * *
                * * * * *
                * * * * *
                * * * * *

         */

        // 1 st way without nested loop

        for (int i = 1; i <=5 ; i++) {
            System.out.print("*"+ " ");

        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*"+ " ");

        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*"+ " ");

        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*"+ " ");

        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*"+ " ");

        }

        System.out.println("------------------");

        // nested loop


        for (int i = 1; i <=5 ; i++) { // outer loop
            System.out.print("*"+ " ");



            for (int j = 1; j <=4 ; j++) {// inner loop
                System.out.print("*"+ " ");
            }

            System.out.println();


        }
    }
}
