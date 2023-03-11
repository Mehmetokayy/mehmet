package ssg15arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int arr[] ={1,3,5,7,8,9};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0]);

        //Example 1: Create an integer array  with 5 elements and print elements  console.

        int numbers[] =new int[5];

        numbers[0]=7;
        numbers[1]=5;
        numbers[2]=4;
        numbers[3]=9;
        numbers[4]=10;
        System.out.println(Arrays.toString(numbers));//[4, 6, 8, 9, 10]

        //Example 2: print elements these are less than or equal to  7 console.

       //1 st way
        for (int w: numbers){

            if (w<=7){
                System.out.println(w);
            }
        }

        //

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers)); //[4, 5, 7, 9, 10]

        for (int w:numbers){
            if(w==10){
                continue;
            }
        }












    }
}
