package practice02dt;

public class Q05 {
    public static void main(String[] args) {


        //1. Task: Count the alphabetical characters in a given value.

        String str= "Wow!...Ali is 13 years old and he is a university student!!!";

        int totalNumOfChars= str.length();

        String strWithhoutPunct= str.replaceAll("\\p{Punct}","");

        System.out.println("strWithhoutPunct = " + strWithhoutPunct);
        
        int strWPLength= strWithhoutPunct.length();

        System.out.println("strWPLength = " + strWPLength);
        
        int countOfAlphabeticalChars=str.replaceAll("^A-Za-z","").length();
       
        System.out.println("strWPLength = " + strWPLength);

        System.out.println("countOfAlphabeticalChars = " + countOfAlphabeticalChars);


    }
}
