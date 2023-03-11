package ssg_extra_loops;

import java.util.Scanner;

public class C07_forloop {
    public static void main(String[] args) {
        /*
        Q7 :  kullanicidan 100'den kucuk bir tam sayi isteyin. 1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter smaller than hundred number please...");
        int number = scan.nextInt();
        if(number>100){
            System.out.println("Please enter smaller than 100");
        }
        for(int i=1; i<number; i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }






    }
}
