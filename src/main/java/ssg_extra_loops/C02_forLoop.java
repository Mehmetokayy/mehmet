package ssg_extra_loops;

public class C02_forLoop {
    public static void main(String[] args) {

        /*
        Ex2: 5 haric 3'ten 9'a kadar olan tum sayilari yazdirmak icin kod yaziniz
         */

        for(int i=3; i<=9 ; i++){
            if(i==5 || i==6){
                continue;
            }else System.out.print(i);
        }



    }
}
