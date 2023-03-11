package arraysmultidimensionalarrays02;

import java.util.Arrays;

public class C01_MultidimensionalArrays {
    public static void main(String[] args) {

        /*
        Bir array'in icindeki data yine bir Array ise buna multidimansional Array denir.

         */


       // String arr[][]={"Abdurrahman", "Emre","Akin","Asan","Yunus","Ali", "Mehmet","Can","Veli"};

       // int arr[]=new[];
       // int brr[]={5,1,5,-3};

        //Multidimensional arrayler nasil olusturulur?

        int arr[][]=new int[3][2];//auter array==> 3
        //inner array ==>2 olan bir multidimensional array olusturduk
        //Bu yontemle inner aarayler sabit olmak zorunda
        System.out.println(Arrays.toString(arr));
        //Icindeki data non-primitive oldugu icin adresleri gorurum.
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.deepToString(arr));

        //Arraylere eleman eklemenin 2.yontemi ile
        //hem declare edip hem de deger atama yontemi

        int arr2[][]={ {2,3},{9},{78,6,4,5}};
        System.out.println("Hem declare hemde deger atamasi ile "+Arrays.deepToString(arr2));// [[2, 3], [9], [78, 6, 4, 5]]
        System.out.println("Hem declare hemde deger atamasi ile "+Arrays.toString(arr2[2]));// [78, 6, 4, 5]  ==>deepToString methodu calismiyor burada.

        //Multidimensional Arraylere eleman nasil eklenir?
        int brr[][]=new int[3][2];
        brr[1][0]=6;
        brr[0][0]=3;
        brr[0][1]=-4;
        brr[1][1]=18;
        brr[2][0]=-7;
        brr[2][1]=0;


        System.out.println(Arrays.deepToString(brr)); //[[3, -4], [6, 18], [-7, 0]]
        System.out.println(Arrays.toString(brr[1]));  //[6, 18]
        System.out.println(brr[1][0]); //6



        // 1:20  18.Session Java Arrays Multidimensional Arrays



    }
}
