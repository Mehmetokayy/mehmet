package practice02dt;

public class Q04 {
    public static void main(String[] args) {

        /*
        Create a String variable and find the sum of ASCII values of the first and last characters of the String.
        String s= "Miami";
         */

        String s= "California";

        int indexOfLastChar= s.length()-1;
        System.out.println(indexOfLastChar);

        int AsciiFirst=s.charAt(0);
        int AsciiLast=s.charAt(indexOfLastChar); //"a"


        System.out.println("Total value of first and last characters:  " + AsciiLast+AsciiLast);








    }
}
