package book_forloop;

public class Forloop19 {
    public static void main(String[] args) {

/*
Find the total number of characters different from space and punctuation marks in a String
String s = "Java is a strongly typed, object-oriented programming language.";
s = s.replaceAll("\\s","").replaceAll("\\p{Punct}", "");
System.out.println(s.length());

 */

        String s = "Java is a strongly typed, object-oriented programming language.";
        String st= s.replaceAll("[^A-Za-z]","");
        int totalNum =0;
        for(int i=0; i<st.length(); i++){
            totalNum=i;
        }
        System.out.println(totalNum);









    }
}
