package day09Loops;

public class Loops01 {
    public static void main(String[] args) {

        /*
        When we need to do "repeated actions" in Java we use loops
         */

        //Example 1: Type "Hi" for 5 times on the console

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.Way: Loops==>There are 4 types of loops in Java=> i)for-loop ii)while-loop iii)do-while loop iva) for each
        //Starting value        Condition/Stop point value           Increment/Derement


        for( int i=1     ;   i<6          ;    i=i+1   ){
            System.out.println("Hamadin");
        }

        //Example 2: type all integers from 11 to 44 "in same line" with a space between consecutive integers
        //          11 12 13 14 15 .......44
        // number%2==0

        for (char i=11; i<45; i++){

            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        /*
        **********************************      Increment  ***************************************
        /////////////////////////////       Increasing by addition operation   ///////////////////////////////////


                                       // 1.way
                                       int i=12;
                                       int i=i+3;  ==>


                                       // 2.way:     i+=3;
                                        int i=12;   i=15;
                                       // 3.way: this way is applicable if you want to increase the number's value by 1 only
                                        i++;  ==> i= i+1;

                                        //Increasing by multiplication operation
                                        int j=4;
                                        int j=j*3;  ==> j*=3;
                                        j=12;


          ///////////////////// Decrement ///////////////

        //Decrement by subtraction
                         //1.way:
                       int k= 10;  k= 10;    k=k-2;   ==>

                         //2.way=2; --> these two syntaxes have same functionality
                              k=8; -->updated value output
                         //3.way: this way is applicable if you want to decrease the number 's value by 1 only.

                                   k--;


           Decrement by division
                            int m= 24;

                             int m= m/6;
            ==>       m/=6;==> have the same functionality

                          */

                   System.out.println();


          //Example 4: Type "odd integers" from 68 to 13 in the same line with a space between consecutive integers

              for (int i=68; i>12; i--){
                   if( i%2!= 0 ){
                       System.out.println(i + " ");
                   }
              }
        System.out.println();



        //Example 5: Type code to print the letters from 'c' to 'u' integers from 11 to 44 in the same line with a space between consecutive integers
        // number%2==0

        for(int i= 11; i<45; i=i+1 ){
            if(i%2==0){

                System.out.print(i + " ");
            }
        }

        System.out.println();
        //************** Decrement *******

       // int k= 10;
       // k= k-2; ==> k-=2;

        //Example 4: Type "add integers" from 68 to 13 in the same line with a space between consecutive integers

        for(int i=68; i>12;  i--){

            if(i%2!=0){
                System.out.println(i + " ");
            }
        }
     //Example 5: Type code to print the letters from 'c' to 'u'.
     //          c d e f ... u

     for(int i='c'; i<'v'; i++){

         System.out.println(i +" ");

     }
        System.out.println();

     //Example: Type code to print integers from 0 to 100 without using any number in your code

        for(int i='a'-'a'; i<'e'; i++){

            System.out.println(i + " ");







        }
        /*

        We can use "int" as data type for char value
        If you use "char" as data type for "char" s Java gives you the character in return
        If you use "int" as data type for "char"s Java gives you the ASCII value of the character
         */

        System.out.println();
        char ch='m';
        System.out.println(ch);//m

        int dh='m';
        System.out.println(dh);//109


    }
}
