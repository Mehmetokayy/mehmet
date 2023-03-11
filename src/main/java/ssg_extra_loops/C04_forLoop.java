package ssg_extra_loops;

public class C04_forLoop {
    public static void main(String[] args) {
        /*
        Q4: 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin.
         */
        int first = 10;
        int last = 30;

        for (int i = first; i <=last; i++)
            if (i < last){
                System.out.print(i + ",");
            }else System.out.print(i);






    }
}
