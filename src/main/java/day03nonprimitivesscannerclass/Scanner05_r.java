package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner05_r {
    public static void main(String[] args) {

        /*
            Type a program which calculates the area and the perimeter of a circle
            whose radius is entered by user.(Use float)
             Hint 1: Take pi number as 3.14159
             Hint 2: Area of a circle is 3.14159 x radius x radius
             Hint 1: Perimeter of a circle is 2 x 3.14159 x radius


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius...");
         Float radius = input.nextFloat();
         Float pi   = 3.14159F; //In the float we have to enter "F" end of number

        System.out.println("(Area of a circle is  " + (pi*radius*radius));
        System.out.println("(Perimeter of a circle is  " + (pi*2*radius));


    }
}
