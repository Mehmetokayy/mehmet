package extra_loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        //Create a method sum of  5 till 10
         int sum=0;
        for (int i = 5; i <11 ; i++) {
             sum = sum+i;

        }
        System.out.println(sum);

        //6'dan 3'e kadar olan tamsayilarin carpimini bulan kodu yaziniz
         int multiply=1;
        for (int i = 6; i>2 ; i--) {
            multiply=multiply*i;

        }

        System.out.println(multiply);

        //Bir tam sayinin rakamlarinin toplamini yazan kodu olusturunuz
        //2543 ==>2+5+4+3=14

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi yazdiriniz");
        int num=input.nextInt();
        num=Math.abs(num);


        int sonuc =0;
        for (int i = num; i>0; i=i/10) {
            sonuc=sonuc+i%10;

        }
        System.out.println(sonuc);



    }
}
