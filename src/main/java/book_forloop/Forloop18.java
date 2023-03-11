package book_forloop;

public class Forloop18 {
    public static void main(String[] args) {
/*
Type code to print unique characters in a String. For example; Hello ==> Heo

 */

 String word="Hello";

    for(int i=0; i<word.length(); i++){
        String s=word.substring(i,i+1);
        if(word.indexOf(s)==word.lastIndexOf(s))
            System.out.print(s);
    }



    }
}
