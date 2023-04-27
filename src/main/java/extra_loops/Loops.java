package extra_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int num =input.nextInt();
        num =Math.abs(num);



        int sonuc=0;
        for (int i = num; i>0  ; i=i/10) {
            sonuc=sonuc+i%10;

        }
        System.out.println(sonuc);









    }
}
