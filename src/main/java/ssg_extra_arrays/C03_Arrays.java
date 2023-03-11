package ssg_extra_arrays;

public class C03_Arrays {
    public static void main(String[] args) {

   /*
   3.soru Verilen bir array'in tum elemanlarini toplayan bir program yazalim,
    */
       int sayi[]={3,5,7,10,2};
       int toplam=0;

        for (int i=0;i<sayi.length; i++) {
            toplam+=sayi[i];

        }
        System.out.println(toplam);
   







    }
}
