package day12_arrays_foreachloop;

import java.util.Arrays;

public class Arrays02_r {
    public static void main(String[] args) {

   //Example 1: Create an integer array, add 6 elements in it. Find the sum of all elements


        int[] ages= new int[7];

        System.out.println(Arrays.toString(ages));

        ages[0]=13;
        ages[1]=24;
        ages[2]=12;
        ages[3]=19;
        ages[4]=34;
        ages[5]=21;
        ages[6]=25;

        System.out.println(Arrays.toString(ages));

        int sum=0;
        for(int w: ages){

            sum= sum+w;
        }

        System.out.println(sum);


        //Example 2: Create an integer array type code to find the sum of the min and max value
        //[12, 45, 9, 56] ==> 9+56=65
        //sort() -->9, 12, 45, 56

        int[] number= new int[4];

        number[0]=12;
        number[1]=45;
        number[2]=9;
        number[3]=56;
        System.out.println("************");
        System.out.println(Arrays.toString(number));
        //System.out.println(Arrays.toString(number)); //[12, 45, 9, 56]
        //sort() puts elements in ascending order automatically

        Arrays.sort(number);

        System.out.println(Arrays.toString(number));

        int sumOfMinMax=number[0] + number[number.length-1];
        System.out.println(sumOfMinMax); //65

        //2.way:
        int [] numbers= new int[4];
        numbers[0]=12;
        numbers[1]=45;
        numbers[2]=9;
        numbers[3]=56;


        int minValues= numbers[0];


        for (int w: numbers){

           minValues = Math.min(minValues, w);

        }


        int maxValues= numbers[0];

        for (int w: numbers){

            maxValues = Math.max(maxValues, w);

        }
        System.out.println(minValues);
        System.out.println(maxValues);










    }
}
