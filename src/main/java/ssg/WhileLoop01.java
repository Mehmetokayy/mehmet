package ssg;

public class WhileLoop01 {
    public static void main(String[] args) {

 //Kullanicidan bir sayi alin ve
 //bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin.
 //6 /1/ 2/ 3/ 6

   int input =56;
   int dividing=1;
   int counter=0;

   while(dividing<=input){
       if(input %dividing ==0){
           System.out.print(dividing+ " ");
           counter++;

       }
       dividing++;
   }
        System.out.println(input + " number dividing" +  counter+"number...");





        do{
            if(input %dividing ==0){
                System.out.print(dividing+ " ");
                counter++;

            }
            dividing++;
        }while(dividing<=input);
        System.out.println();
        System.out.println(input + " number dividing" +  counter+"number...");






    }
}
