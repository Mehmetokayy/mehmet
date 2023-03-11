package ssg_extra_loops;

public class C06_forLoop {
    public static void main(String[] args) {
        /*
        Soru 6)100'den baslayarak 50'ye (dahil) kadar sayilari aralarinda virgul olarak ayni satirda yazdirin
         */
        int first=100;
        int last =50;
        for(int i=first; i>=last; i--){
          if(i>last){
              System.out.print(i +",");
          }else System.out.print(last);



          for(int j = 100; j>=50 ; j--){
              if(j>50){
                  System.out.println(j +",");
              }else System.out.println(i);
          }



        }
    }
}
