package day18varargsstringbuilderstringbuffer;

public class StringBuilder01 {
       /*
        1)"StringBuilder" is a Class in Java, it is used to create Strings.
        2)Question: We have "String Class" to create "Strings", why did Java create "StringBuilder" class to create "Strings"?
                    "String Class" is "Immutable", we sometimes need "Mutable Strings" that is why Java created "StringBuilder" class
     */

    public static void main(String[] args) {

        String s = "Java";
        //String Class is "immutable" that is why when you do any update on "s", Java does not change the value in "s container"
        //Java creates a new container for the updated value and puts the updated value in the new container.
        String t = s.concat("!");
        System.out.println(s);//Java

        s = s.concat("Wooow");
        System.out.println(s);//JavaWooow

        //Let us create a "Mutable String"
        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println(sb1);//Java

        //Whe I use any method to update a StringBuilder original value will be updated.
        sb1.append("!").append("...");
        System.out.println(sb1);//Java!...

        //insert(4," is love"); will skip first 4 characters, then insert " is love"
        sb1.insert(4," is love");
        System.out.println(sb1);//Java is love!...

        sb1.insert(2, "Money", 1, 4);
        System.out.println(sb1);//Jaoneva is love!...

        sb1.replace(2, 5, "1");
        System.out.println(sb1);//Ja1va is love!...

        sb1.deleteCharAt(2);
        System.out.println(sb1);//Java is love!...

        sb1.delete(8, 12);
        System.out.println(sb1);//Java is !...

        //If "Reverse a String" question is asked to you in an interview, do not forget to mention about reverse() method
        //in StringBuilder Class.
        sb1.reverse();
        System.out.println(sb1);//...! si avaJ

        //toString(); is for converting "StringBuilder" to "String", but toString(); method does not change the
        //structure of original "StringBuilder"
        String newS = sb1.toString();

        StringBuilder sb2 = new StringBuilder("Lava");
        StringBuilder sb3 = new StringBuilder("Java");

        //sb2.compareTo(sb3); method compares sb2 with sb3 lexicographically.
        //If sb2 is before sb3 the result will be negative, If sb2 is after sb3 the result will be positive
        //The int value method returns displays the difference between the ASCII values
        int r = sb2.compareTo(sb3);
        System.out.println(r);//2






















    }
}
