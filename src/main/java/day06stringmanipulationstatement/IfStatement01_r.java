package day06stringmanipulationstatement;

public class IfStatement01_r {
    public static void main(String[] args) {

        //Example 1: Type code to find the index of the first occurrence of 'a' in a given String
        //         Alabama ==>
        String s ="Alabama";


        //indexOf('a') will give you the index of 'a'

        int idxA= s.indexOf('b');
        System.out.println(idxA);//3

        //Example 2: Type code to find the index of the first occurrence of 'java' in a given String
        //          java is easy to learn, java is common in the market, java is OOP

     String jav= "java is easy to learn, java is common in the market, java is OOP";

     //indexOf("java"); will give you the index of first character of the first occurrence of "java"
     int idexJava=jav.indexOf("easy");
        System.out.println(idexJava);

        //Note 1: If you use "non-existing character or characters" in indexOf() method, it will give you "-1"
        //Note 2: indexOf() method can be used with "char" and "String" data types


        //Example 3: Type code to find the index of the last occurrence of 'm' in a given String
        //      miami ==>

        String u="miami";

        int lastm =u.lastIndexOf("i");

        System.out.println(lastm);

        //Example 3: Type code to find the index of the last occurrence of 'earn' in a given String
        //      Learn java earn money ==>

        String money= "Learn java earn money";

        int  javaMoney= money.lastIndexOf("earn");
        System.out.println(javaMoney); //11



        //Note 1: If you use "non-existing character or characters" in lastIndexOf() method, it will give you "-1"
        //Note 2: lastIndexOf() method can be used with "char" and "String" data types

        //Example 5: Type code to check if a given character is unique or not in a given String
        //          miami ==> 'a' ==> Unique - 'i' --> Not unique

        //Note: If character is unique in a String indexOf() and lastIndexOf() gives the same output
        String unique="miami";
        char ch ='a';
        boolean result=unique.indexOf(ch)==unique.lastIndexOf(ch);
        System.out.println(result);

        /*
          Note: When you type code you should be careful about "coding standarts"
               i)Separate "data" and the "main code"

         */























    }
}
