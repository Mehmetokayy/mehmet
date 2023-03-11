package day14multidimensionalarraysarraylists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Md01_r {
    public static void main(String[] args) {

        //Example 1: Convert 2 dimensional array to 1 dimensional array
        //      [ [5,3], [9, 8, 7] ] ==> [5, 3, 9, 8, 7]

        int a[][] = {{5, 3}, {9, 8, 7,}};


        //1.step: Find the number of elements in the multidimensional array
        int sum = 0;

        for (int[] w : a) {
            sum = sum + w.length;
        }

        System.out.println(sum); //5


        //2. step: Create new 1 dimensional array whose length is the same
        int b[] = new int[sum];


        //    with number of elements in the multidimensional array
        //3. step: Transfer the elements from the multidimensional array to the 1 dimensional array
        int idx = 0;

        for (int[] w : a) {

            for (int k : w) {

                b[idx] = k;

                idx++;

            }
        }
        System.out.println(Arrays.toString(b));

        //35
        int sun = 0;


        int c[][] = {{3, 5, 7, 56, 7, 9, 0}, {48, 9, 33, 3, 1, 4, 2, 7, 5}, {4, 8, 2, 5, 4}, {83, 23, 57, 7, 99, 568076807}};

        for (int[] w : c) {
            sun = sun + w.length;
        }
        System.out.println(sun);


        //2. step create new dimensional array whose length is the same
        //  with number of elements in the multidimensional array


        //3.Step: Transfer the elements from the multidimensional array to the 1 dimensional array


    }







}
