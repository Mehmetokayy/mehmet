package ssg;

public class ForWhileDoWhileLoop01 {
    public static void main(String[] args) {

        // 1 ile 5 arasindaki(1 ve 5 dahil) sayilari ayni satirda yazdirin
        //1 way
        for (int i=1; i<6 ; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //2.way-while
        int j=1;
        while(j<=5){
            System.out.print(j+ " ");
            j++;
        }
        System.out.println("\n");
        //3.way-do while loop
         int k=4;
         do{
            System.out.print(k+ " ");
            k++;
        }while(k>5);



    }
}
