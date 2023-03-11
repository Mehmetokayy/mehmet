package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner03_r {
    public static void main(String[] args) {

        //Ask user to enter width and the length of a rectangle, then calculate
        //perimeter and the area of the rectangle.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter  width and length of a rectangle please...");
            double width  = input.nextDouble();
            double lenght = input.nextDouble();


        System.out.println("perimeter of rectangle is " + 2*( width + lenght));
        System.out.println("area of rectangle is " + ( width*lenght));

    }
}
