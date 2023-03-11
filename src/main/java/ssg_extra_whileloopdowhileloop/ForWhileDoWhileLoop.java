package ssg_extra_whileloopdowhileloop;

public class ForWhileDoWhileLoop {
    public static void main(String[] args) {
        //ex1: 1 ile 5 arasindaki(1 ve 5 dahil) sayilari ayni satirda yazdirin.

        //1.way
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //2.Way
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println("\n");

        //3.Way
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);

        //18 min   35 lesson
    }
}