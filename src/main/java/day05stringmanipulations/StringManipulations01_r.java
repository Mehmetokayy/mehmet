package day05stringmanipulations;

public class StringManipulations01_r {
    public static void main(String[] args) {


        String flower = "Noord_Amsterdam";
        char harf = flower.charAt(6);
        System.out.println("Flower " + harf);
     //Example 1: Type code to check if the seventh character of a given String is "a"
        String s="Alabama State";
        
        //1.way
        
        char seventh= s.charAt(6);
                    boolean result1=s.charAt(6)=='a';
        System.out.println("seventh = " + seventh);
        System.out.println("result1 = " + result1);
      //2.way
        
        boolean result2=s.startsWith("a",8);

        System.out.println("result2 = " + result2);
        
        String t="Learn Java earn money";

        //1.way: substring()
             String result3= t.substring(t.length()-5);

        System.out.println("result3 = " + result3);

          boolean    money=t.endsWith("money");
        System.out.println("money = " + money);

        //2.way
        
        boolean result4=t.endsWith("money");
        System.out.println("result4 = " + result4);
        
        
        //Example 3: Type code to convert "money" to "dollar"
        String result5=t.replace("money","dollar");
        System.out.println("result5 = " + result5);
        
        //Example 4: Type code to convert "a" to "*"

        //Note: You can use "char" and Strings in replace () parenthesis. Both data types should be matching
        //both values should be "char" data type or both must be "String" data type.
        //You cannot make one data type as "char" the other replacement value data type as "string".
       String result6 = t.replace("a","*");
        System.out.println("result6 = " + result6);
        
        //Example 5: Type code to convert "earn" to "win"
        
        String result7=t.replace("earn", "win");
        System.out.println("result7 = " + result7); //t3 = Lwin Java win money
        
        






    }
}
