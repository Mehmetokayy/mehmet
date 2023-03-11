package day12_arrays_foreachloop;

import java.util.Arrays;

public class Arrays01_r {
    public static void main(String[] args) {


/*
 1)primitive variables and String can store just a single data in them
 Sometimes we need to "store multiple data" in a single container. To able to store multiple data in a single container, Java created a new structure called "Arrays"

 2)Arrays cannot store "non-primitives", if you see "non-primitives" were stored actually they are the references of non-primitives. Arrays can store i)primitive data types ii)references
 of non-primitives

  */

   //How to  create an Array
        String sixthGraders[]= new String[5];


        //how to print an Array on the console
        System.out.println(sixthGraders); //[Ljava.lang.String;@4dd8dc3 ==> reference of Array. This syntax gives the adress of the Array
                                                                        //we need the array elements mostly to store multiple data in the same container
                                                                        // to be able to see the elements of an Array we use the following syntax.

        System.out.println(Arrays.toString(sixthGraders));

        //How to add elements into an array
        sixthGraders[1]="Muhittin";

        sixthGraders[3]="Angie";

        sixthGraders[0]="Bart";

        System.out.println(Arrays.toString(sixthGraders));

        //How to print a specific element from an Array
        System.out.println(sixthGraders[0]);

        System.out.println(sixthGraders[0]  +  " - " + sixthGraders[4]);

        //How to find the number of elements in an Array

        int numOfElements=sixthGraders.length;


        System.out.println(numOfElements);



        //Example 1: Create a String Array, add 5 elements in it, type code to print
        //  the sum of the characters in the first and last element on the console.
        // make your code dynamic

        String[] cities = new String[5];

        cities[0]="Miami";
        cities[1]="New York";
        cities[2]="Berlin";
        cities[3]="Amsterdam";
        cities[4]="Istanbul";

        int numOfCharsIntFirstIndex= cities[0].length();//5


        int numOfCharsIntLastIndex= cities[cities.length-1].length();//by typing our coding syntax that works for every single array's last index element
                                                                     //we need to type our code in dynamic way. When we type "cities[cities.length-1]
                                                                     //we can always get the last index of an Array

        System.out.println(numOfCharsIntFirstIndex + numOfCharsIntLastIndex);

        //Example 2: Create a String Array, add 5 elements in it, type code to print
        //         the sum of all characters in all element on the console.

        String[] names= new String[5];

        names[0]="Brad Pitt";
        names[1]="Cuneyt Arkin";
        names[2]="Ajda Pekkan";
        names[3]="Angelina Jolie";
        names[4]="Sylvester Stallone";

        int sum=0;
        for(int i=0; i< names.length; i++){

           sum = sum+names[i].length();

           System.out.println(sum);
        }
        System.out.println("The sum of characters of all elements =" +" "+sum);

        //2.way:using for-each loop (enhanced loop)

       int total=0;

        for (String w: names){ //has the same functionality with these sections-->(int i=0; i<names.length; i++)


            total= total+ w.length();


        }
        System.out.println(total);

        /*
        Note 1: "for-each loop" can be used with "Arrays" and "Collections", if there is no Arrays and collections
        you cannot use for-each loop, you have to use for-loop or while-loop or do while loop.

        Note 2: Sometimes for-each loop cannot be used with Arrays and Collections as well. When using indexes is a must,
        using for-each loop is impassible
         */






















    }
}
