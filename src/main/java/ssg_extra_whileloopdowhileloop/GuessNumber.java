package ssg_extra_whileloopdowhileloop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //bilgisayara 1 ile 100 arasinda bir sayi tutturun
        //kullanicidan bu sayiyi tahmin etmesini isteyin
        //girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        //kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd=new Random();

        int num=rnd.nextInt(10);;
        Scanner input = new Scanner(System.in);
        int guess=0;

        int counter=1;


        while(num !=guess){
            System.out.println("Please enter number");
            guess=input.nextInt();

            if(guess<num){
                System.out.println("Please enter smaller number ");
            } else if (guess>num) {
                System.out.println("Please enter bigger number ");
            }
            counter++;
        }
        System.out.println("Your number" +(counter-1) + "times you guess ");









    }
}
