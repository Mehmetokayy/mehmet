package book_forloop;

public class Forloop08 {
    public static void main(String[] args) {

        /*Type code to print odd integers from 20 to 3 in the same line with a space between two
       consecutive ones.*/

         int a=0;
        for(int i=19; i>2; i-=2){

           for (int j=2; j<i; j+=2 ){
               

               System.out.print(i+" "+j+" ");
           }



        }





    }
}
