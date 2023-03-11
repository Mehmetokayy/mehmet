package mehmet__day31_collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

 //List ==> interface

        /*
        Create a list
        1)ArrayList<String>list1 = new ArrayList<>();
        2)List<String>List2 = new ArrayList<>();

        List<String>list3 = new List<>(); ==> Bu mumkun degildir cunku interface de cunstrocter kullanilmaz.

        -----Notlar----
        1)interface'lerden object olusturulamaz cunku interface'lerin constructorlari yoktur. Abstruct ta counstructor var ama cunstructor object olusturamiyor.
        2)Abstruct Class'lardan object olusturulamaz, constructor'lari vardir ama constructor object olusturmada kullanilamaz.
        3)Interface'lerin constructor'lari olmadigindan collection olustururkeninterface isimleri "new" keyword'unden sonra kullanilamaz.
        4)class --> class ==> extends
          class --> interface ==>implements *********
          interface --> interface ==>extends
          interface --> class ==> Bu mumkun degildir.

          ArrayList'ler eleman ekleme ve silmede basarisizdirlar, o yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez. LinkedList de ekleme ve silme cok kullanislidir.

       LinkedList'ler index kullanmadiklarindan eleman silmede ve silmede re-index yapilmasina gerek yoktur.Buda LinkedList'leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve
       silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.
       **LinkedList'lerde search islemi zor yapilir. Cunku LinkedListlerindex kullanmaz, index kullanmayinca herhangi bir elemani bulmak icin en bastan butun elemanlar kontrol edilir. Bu da cok fazla is demektir.

         */

 //ArrayList
 //LinkedList

        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Carl");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        names.addFirst("Hamido");


        System.out.println(names); // [Steve, Carl, Raj, Megan, Brandon]


        names.addLast("Memoli"); //"addLast()" method is equivalent to "add()".
        System.out.println(names);

        names.add(3,"Suaayip");
        System.out.println(names);

        System.out.println("\n");
        names.remove("Memoli");
        System.out.println(names);

        //1:30     31 collection








    }
}
