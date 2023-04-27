package mentor;

public class Samenstud {
    public static void main(String[] args) {


       /*
       Create a String variable for city names which have just a single word. Print the city name with the initial is in uppercase and all the other characters are in lower cases on the console. Example: mIAMI should be printed as Miami miami should be printed as Miami MIAMI should be printed as Miami mIaMi should be printed as Miami etc.


        */

        String city= " miami";
        String up=city.toLowerCase().trim();
        String s=up.substring(0,1).toUpperCase()+ up.substring(1);

        System.out.println(s);


        /*
        Create 3 String variables for people's names. Print the sum of the number of characters in all the 3 names except space characters.
         Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

         */
        System.out.println();


        String name1="Ali Can";
        String name2="Merve Star";
        String name3="Mark Tom";

       int a= name1.replaceAll("\\s","").length();
       int b= name2.replaceAll(" ","").length();
       int c= name3.replaceAll(" ","").length();

        System.out.println(a+b+c);



        /*
        Create a String variable, print the total number of alphabetical and numeric characters in the String on the console.
         Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.

         */

          String str= "Miami 33018!!!";
         int d= str.replaceAll("[^A-Za-z0-9]","").length();
        System.out.println(d);



        /*
        Create a String variable, print the number of non-digit characters in the String on the console.
         Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console
         */

        String f="1 a3Bcf4!...";
       int e= f.replaceAll("[0-9]","").length();
        System.out.println(e);


        /*
        Create a String variable and print just the last non-space character on the console for any String.
         Example: For ‘Ali Can’ you should print n For ‘Miami ’ you should print i etc.
         */
        String st="Ali Can";
        String ch=st.replaceAll("\\s","").substring(st.length()-1);

        System.out.println(ch);

    }
}
