package day04Scanner;

public class StringManipulations03_r {
    public static void main(String[] args) {

        //Example 1:   Check the password if it has given rules.
        //         i)It should start with "J"
        //        ii)It should have at least 8 characters
        //        iii)Last 3 characters should be "AVA"


        String pwd="M12!?AMAA";
        boolean first= pwd.startsWith("M");

        //ii)It should have at least 8 characters
        //Note: There are comparison operators in Java==> "==", "<",">", "<=", ">=", "!="
        // 3==5 --> false
        // 3!=5 --> true
        //While using comparison operators, you will get  "boolean" data type object all the time

        /*
        What we learned so far
        1)charAt()=>find the character at given index ==> return type ->char
        2)toUpperCase()==> String
        3)toLowerCase()==> String
        4)trim() ==> used for deleting the extra space from a the beginning and ending of a String value->String
        5)split() ==> to break a String value from the given character -> String
        6)length() ==> is used to find the total number of the characters of a String ->int
        7)substring(beginning index, ending index) ==> used to get the required part of a String -> String
        8)substring(beginning index) ==> will start getting the characters from the  given value to the lastindex
        9)equals() ==> boolean
        10) equalsIgnoreCase=>String
        11)startWith()==>boolean

         */
        Boolean length=pwd.length()>7;

        System.out.println("length = " + length);

        System.out.println("first = " + first);
        
        String mehmetOkay ="whereareYou";
        boolean lengthmemo =mehmetOkay.length()>10;
        System.out.println("lengthmemo = " + lengthmemo);
      
        
        String memoCan ="Zerf46578";
        
        boolean memo= memoCan.startsWith("Z");
        System.out.println("memo = " + memo);




        //iii)Last 3 characters should be "AVA"

        //If you want to  get characters from on index to the last index character, use substring() just with start index


        boolean third=pwd.substring(5).equals("AVA");

        System.out.println("third = " + third);
        
        
        
         String sifre="Memoli1625";
         Boolean bir=sifre.startsWith("Me");
        System.out.print("Start with me " + bir);
       boolean uzunluk = sifre.length()>9;
        System.out.println("Uzunluk(length = " + uzunluk);
        boolean second=sifre.substring(2).equals("moli1625");
        System.out.println("second = " + second);




    }
}
