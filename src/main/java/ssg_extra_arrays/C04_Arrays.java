package ssg_extra_arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        /*
        4.soru verilen 3 elemanli bir array in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
        Ornek; array(1,2,3) ise output (2,3,1) olacak
         */

        int arr[]={1,2,3,4,5,76};
        int atama=arr[0];
        for (int i=0; i< arr.length-1; i++) {
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=atama;
        System.out.println(Arrays.toString(arr ));




    }

}
