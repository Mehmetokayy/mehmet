package ssg_extra_arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
      /*
      5.soru verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturun.
       */

        int sayilar[] = {1, 2, 3, 4, 5, 59, 80};
        maxSayiyiYazdir(sayilar);

    }public static void maxSayiyiYazdir(int [] sayilar){
        int maxSayi=sayilar[0];
        for(int i =1; i<sayilar.length; i++){
            if(sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }
        }

        System.out.println(maxSayi);

    }
}
