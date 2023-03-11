package arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Comparator;

public class C05 {
    public static void main(String[] args) {
//1, 2, 6, 7
  /*
      int arr[]={2,1,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,7));
        System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.binarySearch(arr,9));

        */

        //Arama motorunda "guzel isimler" adli bir application icin isimleri
        //kucukten buyuge dogru siralayan kodu yaziniz

         String arr[]={"Abdurrahman", "Emre","Akin","Asan","Yunus","Ali", "Mehmet","Can","Veli"};
         System.out.println(Arrays.toString(arr));

         Arrays.sort(arr, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(arr)); //[Ali, Can, Emre, Veli, Yunus, Mehmet, Abdurrahman]


        //String array elemanlarini karakter sayisina gore ve natural order(alfabetik siraya gore)'a gore
        //ve tersten buyukten kucuge siralayiniz.

        String brr[]={"Abdurrahman", "Emre","Akin","Asan","Yunus","Ali", "Mehmet","Can","Veli"};
         Arrays.sort(brr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(brr));

    }
}
