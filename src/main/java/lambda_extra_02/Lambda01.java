package lambda_extra_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

   List<Double> myList =new ArrayList<>();
   myList.add(12.0);
   myList.add(4.0);
   myList.add(7.0);
   myList.add(3.6);
   myList.add(26.8);
   myList.add(38.4);
   myList.add(26.8);

   List<String> list = new ArrayList<>();
   list.add("Tom");
   list.add("Jhon");
   list.add("Ajda");
   list.add("Cuneyt");
   list.add("Angelina");
   list.add("Tom");
   list.add("Brad");





        List<Double> half = getHalfOfElementsGreaterThanFiveDistinctReversed(myList);
        System.out.println(half);
        System.out.println();
        printAllAlphabeticallyDistinct(list);
        System.out.println();
        printAllAlphatikLowerCase(list);
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
        //System.out.println(removeElementIfTheLengthGreaterThanFive(list));
        System.out.println("****");
       // System.out.print(removeElementIfStartsWithAorEndsWithd(list));
        System.out.println(printLengthSquare(list));
        System.out.println();
        System.out.println(printElementsLengthEven(list));
        System.out.println("**");
        printAllSortWithLastCharUpperDistinct2(list);



    }

    //1)Create a method to find the half of the elements gerater than 5' distinct, in reverse order in a list
    public static List<Double> getHalfOfElementsGreaterThanFiveDistinctReversed(List<Double> myList){
     return    myList.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
   //2)Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz.
    public static void printAllAlphabeticallyDistinct(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.print(t +" "));
    }
    //3)Tum list elemanlarini kucuk harfle alfabetik siranin tersinde tekrarsiz olarak yazdiriniz.
    public static void printAllAlphatikLowerCase(List<String>list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));
    }

    //4)Tum list elemanlarini buyuk harfle, uzunluklarina artan sirada, tekrarsiz olarak yazdiriniz.
    public static void printAllSortWithLengthUpperDistinct(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t +" "));

    }

    //5)Tum list elemanlarini buyuk harfle, son harflerine gore artan  sirada, tekrarsiz olarak yazdiriniz.
    public static void printAllSortWithLastCharUpperDistinct1(List<String> list){
        list.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t + " "));
    }
    //5)Tum list elemanlarini buyuk harfle, son harflerine gore artan  sirada, tekrarsiz olarak yazdiriniz.
    public static void printAllSortWithLastCharUpperDistinct2(List<String> list){
        list.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).reversed()).
                forEach(Utils::printInTheSameLineWithSpace);
    }

    //6)Tum list elemanlarini buyuk harfle, uzunluklarina artan sirada, tekrarsiz olarak yazdiriniz.
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String>list){

        list.stream().
                distinct().
                map(t->t.toUpperCase()).//String::toUpperCase yapisina "method reference" denir.
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);

    }

    //7)Character sayisi 5 den fazla olan elemanlari siliniz
    public static List<String> removeElementIfTheLengthGreaterThanFive(List<String>list){

        list.removeIf(t->t.length()>5);

        return list;

    }

    //8)"A" ile baslayan veya "d" ile biten elemanlari siliniz. //1:30 lambda

 //   public static List<String> removeElementIfStartsWithAorEndsWithd(List<String>list){

 //       list.removeIf(t->t.startsWith("A")  || t.endsWith("d"));//      //Bazen "stream()" methodu bize lazim olan method'lara ulasmamiza engel olur bu yuzden
        //stream() methodunu kullanmayiz."removeIf()" methodunda oldugu gibi.

        //Fakat stream() methodunu daha sonradan kullanmamiz gerekebilir. Bu durumda stream() methodunu
        //kullanarak istedigimiz method; methodlara ulasiriz, distinct() methoduna ulastigimiz gibi

        //Sonuc bize list olarak lazim ise "collect(Collectors.toList())" ile sonucu liste ceviririz.
//        return list.stream().distinct().collect(Collectors.toList());
 //   }
    //9)List elemeanlarini character sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz
    public static List<Integer>printLengthSquare(List<String>list){
        return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());

    }
   //10)List elemanlarindan character sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> printElementsLengthEven(List<String>list){
      return   list.stream().filter(Utils::isEven).collect(Collectors.toList());
    }


}
