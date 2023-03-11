package arraysmultidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C04_Arrays {

    //Bir Arrayin icinde herhangi bir elemanin olup olmadigini
    //kontrol eden ve kac kere tekrararlandigini gosteren kodu yaziniz


    public static void main(String[] args) {

         int myArray[]=new int[10];
         myArray[0]=5;
         myArray[1]=8;
         myArray[2]=15;
         myArray[3]=20;
         myArray[4]=56;
         myArray[5]=70;
         myArray[6]=6;
         myArray[7]=42;
         myArray[8]=97;
         myArray[9]=100;
         int size=myArray.length;
        System.out.println(size);
        System.out.println(myArray[9]);
        Arrays.sort(myArray);
        System.out.println("****");
        System.out.println(Arrays.toString(myArray));


        String str[]={"Ali", "Ahmet", "Kemal", "Can"};
        Arrays.sort(str);
        for (int i=0;i< str.length;i++) {
            System.out.print(str[i] +"");//[AhmetAliCanKemal5]
        }

        for (int i = 0; i < size; i++) {
            System.out.println(myArray[i]);

        }  //
        System.out.println("\n");
        System.out.println(Arrays.toString(myArray));


        int arr[]={5,1,5,-3};
        int eleman=1;
        int counter=0;


        for (int w : arr) {
            if(w==eleman){
                counter++;
            }//if
        }//for
        if (counter>0){
                System.out.println(eleman+"Arrayde "+counter+"defa var");
            }else
                System.out.println(eleman+"Arrayde yok");














    }



}
