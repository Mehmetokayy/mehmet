package day08ternary_swich;

public class NestedTernary01_r {
    public static void main(String[] args) {

        /*

        Type java code by using nested ternary.
        Write a program to check if a year is "Leap year" or not.
        i)If the year is divisible by 100 then it must be divisible by 400.==>1600+ 1800
        ii)If a year is not divisible by 100 then it must be divisible by 4.==>2004+ 1997

         */


        int year=2020;

       Object r =year%100 == 0 ? (year%400==0 ? "Leap year" : "Not leap year"):(year%4==0 ? "Leap year" : "Not leap year") ;
        System.out.println(r);
      /*
      Type code to check the password
      If it has more than 8 characters, initial should be 'i'
      if it has no more than 8 characters initial should be 'K'
      Solve the task by using nested-ternary

       */

        String psw ="392rjsckm";

        String r1= psw.length()>8 ? (psw.startsWith("i") ? "Valid Password" : "Invalid Password") : (psw.startsWith("K") ? "Valid password"  : "Invalid password");
        System.out.println(r1);























    }
}
