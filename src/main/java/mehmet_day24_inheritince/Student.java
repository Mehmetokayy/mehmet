package mehmet_day24_inheritince;

public class Student {
    /*
    Access modifier
    1)Public  2)protected
    3)default (Access Modifier'i default yapmak icin access modifier yazmaliyiz)
    yazarsan kizar
    4)private


    Note: Access Modifier'lari genisten dara doru sayiniz

        public > protected > default > private
    Note: Access Modifier'lari birer birer aciklayiniz
          public olanlar her class'dan kullanilabilir
          protected olanlar baska package'lerden  kullanilamaz
          ancak baska package'de "child class" icinden kullanilabilir
          default olanlar baska package'den kullanilamazlar
          private olanlar sadecece olusturduklarilari Class icinde kullanilabilirler
    Note: "protectec" ile "default" un farkini soyleyiniz
           Protected olanlar baska packge'de "child class' icinden kullanilabilir
           default olanlar baska package'den kullanilamazlar

     Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
     public, default kullanilir ama protected ve private kullanilmaz
     */

    //public her class'dan kullanilabilir.
      public String stdName1="Ebubekir Can";


   //protected olanlar baska package'dan sadece child class'lardan gorulur

   protected String address="Istanbul";

   //kullanilamazlar isyeri mail'i
   String email="ebcan@gmail.com";

   //Class icinde kullaniklabilirler TC NO
   private String bsn= "11332566";


}
