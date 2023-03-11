package ssg_extra_whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

    //Kullanicidan bir sayi alin ve
    //bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
    // 6 = 1 2 3 6


       Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number...");
        int num=scan.nextInt();

       // int input=6;
        int bolen=1;
        int counter=0;
   /*
        while (bolen<=num) {
            if (num %bolen==0){
                System.out.print(bolen+ " ");
                counter++;
            }
            bolen++;
        }
        System.out.print(num +" " + "sayinin bolen" +" "+ counter + " adet sayi vardir ...");

  */
         do{
            if (num %bolen==0){
                System.out.print(bolen+ " ");
                counter++;
            }
            bolen++;
        }while (bolen<=num);
        System.out.print(num +" " + "sayinin bolen" +" "+ counter + " adet sayi vardir ...");





    }
}
