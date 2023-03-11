package day08ternary_swich;

import java.util.Locale;
import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {

        //Example 1: Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain"
        //Bulgaria, Albania, France
        //Type code to print abbreviation of the countries. US, UK, DE, TR, IN, PE, ES, BG, AL, FR

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a country name among America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France");

        String country= input.next().toLowerCase();
        switch (country){

        case"America":
             System.out.println("US");
             break;
        case"England":
             System.out.println("UK");
             break;
        case"Germany":
             System.out.println("DE");
             break;
        case"Turkey":
            System.out.println("TR");
            break;
        case"India":
            System.out.println("IN");
            break;
            default:
                System.out.println("Undifined country name");
        }
    }
}
