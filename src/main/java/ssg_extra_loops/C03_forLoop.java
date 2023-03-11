package ssg_extra_loops;

import java.util.Scanner;

public class C03_forLoop {
    public static void main(String[] args) {
        /*
        Ex3: belirlenen sayinin 1 den 10 a kadar carpim sonuclarini yaopan Java programini yaziniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number please..");
        int number=scan.nextInt();

        for(int i=1; i<11; i++){
            System.out.println(number +"X"+i+"="+number*i);
        }





    }
}
