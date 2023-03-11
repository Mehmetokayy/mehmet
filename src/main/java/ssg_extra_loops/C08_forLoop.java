package ssg_extra_loops;

import java.util.Scanner;

public class C08_forLoop {
    public static void main(String[] args) {

        /*
        Ex 8) kullanicidan 100 den kucuk bir tam sayi isteyin. 1'den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter smaller then 100 a number...");
        int num=scan.nextInt();

        for(int i=1 ; i<=num; i++){
            if(i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }









    }
}
