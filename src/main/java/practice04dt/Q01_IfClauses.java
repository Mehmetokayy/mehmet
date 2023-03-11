package practice04dt;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Q01_IfClauses {
    private static final Set<String> MONTHS = Set.of("december", "january", "february");

    public static void main(String[] args) {

        //Type a code to print its season after getting a month from user

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a month name");
        
        String month= input.next().toLowerCase();

        if(month.equals("march") || month.equals("april") || month.equals("may")){
            System.out.println("Spring");
        }else if(month.equals("june") || month.equals("july") || month.equals("august")){
            System.out.println("Summer");
        }else if(month.equals("september") || month.equals("october")|| month.equals("november")){
            System.out.println("Autumn");
        }else if(month.contains(month)){
            System.out.println("Winter");
            System.out.println("Please enter a valid month name...");
        }


    }
}
