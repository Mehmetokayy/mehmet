package day05stringmanipulations;

public class StringManipulation_02_r {
    public static void main(String[] args) {
        
        //Example 1: Delete all "y"s from a given String
        
        String s= "Everything is easy if you study";
        
        String result1=s.replace("y", " ");

        System.out.println("result1 = " + result1);


        /*
        What Regular Expression ==>Regex
        1) All digits ==> [0-9]
        2) All lowercases ==>[a-z]
        3) All UpperCases==>[A-Z]
        4) All letters==> [a-zA-Z]
        5) All letters and digits [a-zA-Z0-9]
        6) All vowels ==>[aeiouAEIOU]
        7) All punctuation marks ==> \\p{Punct}
        8) All characters "different from" ==> [^]
        9) All characters "different from" ==> [^a-z]
        10) All characters "different from" letters ==>[^a-zA-Z]
        11) All characters "different from" vowels ==> [^aeiouAEIOU]

         */
        //Example 2: Delete all digits(0,1,2,3,4,5,6,7,8,9) from a given String
        //[0-9] ==>regular expression in Java

        String t = "Tom is 13 years old, and his GPA is 3.98 ";
        String result2=t.replaceAll("[0-9]", "");
        System.out.println("result2 = " + result2);
       String result3= t.replaceAll("[aeiouAEIOU]","");
        System.out.println("result3 = " + result3);
        
        
        //Example 4: Count how many letters are there in a String
        //Logic: i)Delete all characters different from letters
        //       ii)Count the remaining characters
        
        String m = "Tom, are you here?";
       double result4 =m.length();
        System.out.println("result4 = " + result4);
          int result5=m.replaceAll("[^a-zA-Z]","").length();
        System.out.println("result5 = " + result5);

        //Example 4: Count how many digits are there in a String
        String n="Tom is 13 years old, and his GPA is 3.98";
          int numdigit=n.replaceAll("[^0-9]","").length();
        System.out.println("numdigit = " + numdigit);
        
        
        //Example 5: Check the user's password according to the given rules
      
        
        //    iii)Password should have at least 1 upper case 



         
        
        String pwd = "As1?fdes3";
        //    i)Password should have at least 8 characters
        boolean check1=pwd.length()>7;
        System.out.println("check1 = " + check1);


        //    ii)Password should not have "space" characters
        boolean check2 =pwd.replaceAll("[^ ]","").length()==0;
        System.out.println("check2 = " + check2);

        //    iii)Password should have at least 1 upper case 
         boolean check3=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("check3 = " + check3);


        //    iv)Password should have at least 1 lower case

                boolean check4=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("check4 = " + check4);

        //    v)Password should have at least 1 symbol(Not letter, not digit)
        
        boolean check5= pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println("check5 = " + check5);


        //    vi)Password should have at least 1 digit
        boolean check6=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("check6 = " + check6);



    }
}
