package day08ternary_swich;

public class Ternary01_r {
    public static void main(String[] args) {

        //Example 1: Type code to select the minimum of two integers

        int a=56;
        int b=12;

      int r1 = a<b ? a : b;   // In ternary there are two option to compare
        System.out.println("Minimum value is: " + r1);


      //Type code to calculate value of an integer
       // 5 ==> 5    - 0 ==>0    -5 ==> -1 * -5==> 5

        int c=-5;

       int r2 = c<0 ? -1*c : c;
        System.out.println(r2);


        //Example 3: If two integers are positive return the multiplication
        //        Otherwise, give a message like "I do not know how to multiply"
        //        3 and 4  ==> 12   - -3 and -4 ==>

        int d = 4;
        int f = -8;
        Object r3=d>0 && f>0 ? d*f : "I do not know how to multiply";

        System.out.println(r3);
















    }
}
