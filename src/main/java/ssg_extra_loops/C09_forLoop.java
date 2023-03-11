package ssg_extra_loops;

import java.util.Scanner;

public class C09_forLoop {
    public static void main(String[] args) {
        /*
        Ex 9) Interview Question; kullanicidan 100'den kucuk bir tam sayi isteyin. 1'den baslayarak girilen sayiya kadar kadar tum sayilar yazdirin. Ancak;
        -Sayi 3'un kati ise sayi yerine "Java" yazdirin.
        -Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
        -Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=scan.nextInt();
        if(100>=num) {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("Java guzeldir");
                } else if (i % 3 == 0) {
                    System.out.print("Java");
                } else if (i % 5 == 0) {
                    System.out.print("Guzeldir");
                } else System.out.print(i + " ");
            }


        }else System.out.println("Please enter smaller then 100 ");
    }
}
