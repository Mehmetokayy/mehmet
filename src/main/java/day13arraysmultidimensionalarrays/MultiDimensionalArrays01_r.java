package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01_r {
    public static void main(String[] args) {

      //How to create multidimensional array

        int arr[][]= new int[4][2];
        System.out.println(Arrays.deepToString(arr));

       //How to add elements into a multidimensional array

       arr[0][0]=3;
       arr[0][1]=10;
       arr[1][0]=53;
       arr[1][1]=36;
       arr[2][0]=24;
       arr[2][1]=17;
       arr[3][0]=11;
       arr[3][1]=48;
        System.out.println(Arrays.deepToString(arr));

        //how to print the element from outer array.

        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[3]));

        //How to print the elements one by one
        System.out.println((arr[2][1])); //17


















    }
}
