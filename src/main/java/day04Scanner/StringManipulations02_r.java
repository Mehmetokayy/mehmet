package day04Scanner;

public class StringManipulations02_r {
    public static void main(String[] args) {

        //Example 1: Get the first 4 characters from a String and convert them to lower cases
        //        Albania ==> Alba ==> alba


        String s= "GerMany";
       String t= s.substring(0,5).toLowerCase();
        System.out.println(t);

        //1. Scenario: "==" and equals() gives you the same output

        //Example 2: Check if two String are same or not.
        String r= "Java";
        String u= "java";

       boolean same=r.equals(u);
        System.out.println(same);

        boolean sameIgnoreCase=r.equalsIgnoreCase(u);   // = --> equals in Math
                                                        // = -->assignment operator

        System.out.println(sameIgnoreCase);

        //why do not we use "==" to compare String values?
        String s1= "TechPro";
        String s2= "TechPro";
        


        boolean r1=s1.equals(s2);
        System.out.println("TechPro= " + r1);

        String m1="OKAY";
        String m2="Okay";
        boolean memo=m1.equalsIgnoreCase(m2);
        System.out.println("memo = " + memo);
        

         boolean r2=s1==s2;
        System.out.println(r2);

        String t1= "Python";
        String t2=new String("Python");

        boolean d1=t1==t2;
        System.out.println(d1);

        boolean d2=t1.equals(t2);
        System.out.println(d2);




    }
}
