package ssg_extra_loops;

import java.util.Scanner;

public class C11_forLoop {
    public static void main(String[] args) {
        /*
        soru 11)1 den girilen sayiya kadar her satirda bir artirarak asagidaki sekli olusturan Java kodunu yaziniz.
        beklenen cikti:
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6


         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number please");
        int num=scan.nextInt();
        for(int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }System.out.println();

        }



    }
}
