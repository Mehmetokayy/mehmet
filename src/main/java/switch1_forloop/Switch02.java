package switch1_forloop;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        // Gets the number of months from the user and prints the season.
        // create switch


        Scanner input =new Scanner(System.in);
        System.out.println("Enter month number please...");
        int monthNO=input.nextInt();

        switch (monthNO){

            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autmn");
                break;

            default :
                System.out.println("The Month Range will be between 1-12 numbers. ");

        }





    }
}
