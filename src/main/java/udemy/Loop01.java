package udemy;

public class Loop01 {
    public static void main(String[] args) {



            //Example 5 times hi


            System.out.println("Hi");
            System.out.println("Hi");
            System.out.println("Hi");
            System.out.println("Hi");
            System.out.println("Hi");


        System.out.println();

           for(int i=1 ; i<6; i++){
               System.out.println("Hi");


        }


      /*
      1)No repetition
      2)Dynamic
      3)Fix and update
       */

      //11-44


        for(int i=11 ; i<45; i++){
            System.out.print(i+" ");
        }


        System.out.println("***********");
   //40'dan 23'e kadar  tum cift tamsayilari ekrana yazdiran kod yazdirin

        for(int i=40; i>22 ; i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }


     //Example 4: 18'den 56'ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz
        System.out.println();
     for(int i=18; i<56; i++){
         if(i%2!=0){
             System.out.print(i+" ");
         }
     }


        System.out.println();
   //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz

        for(int i=21; i<181; i++){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

      //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan characterlerini buyuk harf yapiniz
       // ankara ==> AnKaRa

       String s = "ankara";
        String t=" ";

        for(int i=0; i<s.length(); i++){
          String ch = s.substring(i,i+1);
            if(i%2==0){
                System.out.println(ch.toUpperCase());

            }
        }
        System.out.println();

        String myText = "apple";
        String myNewText=myText.substring(0,1).toUpperCase().concat((myText.substring(1)));

        System.out.println(myNewText);

        System.out.println();

      String m="mehmet";

      String newm=m.substring(1,3);
        System.out.println(newm);


       //12. lesson is finish












    }
}
