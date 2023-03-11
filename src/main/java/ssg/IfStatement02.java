package ssg;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //
        Scanner input = new Scanner(System.in);
        System.out.println("Give a day please ...");

        String day = input.next().toLowerCase();

        if (day.equals("manday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            System.out.println("Weekdays");
        } else if (day.equals("saturday") || day.equals("sunday")){

            System.out.println("Weekend");
        }

        else{
            System.out.println("Wrong day!");
        }


















    }
}
