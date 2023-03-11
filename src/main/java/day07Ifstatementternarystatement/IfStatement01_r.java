package day07Ifstatementternarystatement;

public class IfStatement01_r {
    public static void main(String[] args) {


        //Example 1: Type code to check if a given character is upper or lower case or others
        char ch = 'S';

        if(ch>= 'A' && ch<='Z'){
            System.out.println("Upper case");

        }else if(ch>='a' && ch<='z'){
            System.out.println("Lower case..");
        }else{
            System.out.println("Others...");
        }

        //Example 2: If a number is less than 300 or grater than 3000
        //           print "Perfect Number" on the console, otherwise
        //           print "Regular Number" on the console.

        int num= 3200;

        if(num<300 || num>3000){
            System.out.println("Perfect Number");

        } else{

            System.out.println("Regular Number");
        }




        //Example 3: Type code to check if a number is "Even" or "Odd"
        int n = 10;

        if(n%2== 0 ){
            System.out.println("Even Number");

        }else{
            System.out.println("Odd Number");
        }

        //Example 4: Type code to print the number of month for the given month name
        //          February-->2    May-->5     December-->12  Tom-->Invalid month name

        String month = "March";

        if(month.equalsIgnoreCase("January")){
            System.out.println(1);
        } else if (month.equalsIgnoreCase("February")) {
            System.out.println(2);
        }else if (month.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (month.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (month.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (month.equalsIgnoreCase("June")) {
        System.out.println(6);
        } else if (month.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (month.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (month.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (month.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (month.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (month.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("Invalid month name");
    }












    }
}
