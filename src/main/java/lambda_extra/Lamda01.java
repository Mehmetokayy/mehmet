package lambda_extra;
/*
1)Lambda "Functional programming"dir, degeri "Structured Programming"
2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
4)Lambda, Java'ya "Java 8"de eklendi.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lamda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        System.out.println(nums);
        System.out.println();
        System.out.println(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printOddElements(nums);
        System.out.println();
        printOddElements2(nums);
        System.out.println();
        printOddOfSquareElements((nums));
        System.out.println();
        printOddOfCubeElements(nums);
        System.out.println();
        printSumOfSquaresEvenElements(nums);
        System.out.println();
        printSumOfSquaresEvenElements(nums);
        System.out.println();
        printProductOfCubesOfDistinctEven(nums);
        System.out.println();
        printProductOfCubesOfDistinctEven(nums);
        System.out.println();
        printMaximumoOfValue1(nums);
        System.out.println();
        printMaximumoOfValue2(nums);
        System.out.println();
        printMaximumoOfValue3(nums);
        System.out.println();
        getMinimumValueFromList1(nums);
        System.out.println();
        getMinimumValueFromList1(nums);
        System.out.println();
        getMinimumValueFromList3(nums);
        System.out.println();
        getMinimumValueFromList4(nums);
        System.out.println();
        getMinGreaterThanSevenEven(nums);


    }
    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)

    public  static void printElements1(List<Integer> nums){
        for (Integer w: nums) {
            System.out.println(w+" ");

        }
    }
     //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements. (Functional)
    //22 min lambda
    public static void printElements2(List<Integer>nums){


        //[12, 9, 131, 14, 9, 10, 4, 12, 15]
        nums.stream().forEach(t-> System.out.println(t+" "));

    }
    //3)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured
    public static void printEvenElements1(List<Integer>nums){

        for(Integer w:nums){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }

    }
    //4)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional
    public static void printEvenElements2(List<Integer>nums){
        nums.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

  public static void printOddElements(List<Integer>nums){
        for(Integer w:nums){
            if(w%2!=0){
                System.out.print(w+" ");
            }
        }
  }
   public static void printOddElements2(List<Integer>nums){
        nums.stream().filter(t->t%2!=0).forEach(t-> System.out.println(t+" "));
   }
   //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
   public static void printOddOfSquareElements(List<Integer>nums){
       nums.
               stream().
               filter(t->t%2!=0).
               map(t->t*t).//"map" normal programlamada set e benziyor.
               forEach(t-> System.out.print(t+" "));
   }
     //6)Create a method to print the cube of distinct odd list elements on the console in the same line with a space
    //between two consecutive elements.
    public static void printOddOfCubeElements(List<Integer>nums){
        nums.stream().
                distinct().//This method select unique number.
                filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    //7)Create a method to calculate the "sum" of the "squares" of distinct even elements
    public static void printSumOfSquaresEvenElements(List<Integer>nums){
      Integer sum= nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(sum);
    }
    //8)Create a method to calculate the product of the square of distinct even elements
    public static void printProductOfCubesOfDistinctEven(List<Integer>nums){
       Integer product= nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
        System.out.println(product);

       //"Generetic" bircok data ile calisan metodlara generetic denir.
    }
   //9)Create a method to find the "maximum value" from the list elements
    public static void printMaximumoOfValue1(List<Integer>nums){
        //1.Way
        //Maximum degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.
        //Minimum degeri ararken Integer.MAX_VALUE kullanmak genel pratiktir.

      Integer max=  nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);
        System.out.println(max);
    }
        //2.Way
        public static void printMaximumoOfValue2(List<Integer>nums) {

            Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
            System.out.println(max);
        }
    public static void printMaximumoOfValue3(List<Integer>nums) {
        //3.Way
        Integer max = nums.stream().distinct().sorted().reduce((t,u)->u).get();
        System.out.println(max);
    }
    //10)Create a method to find the minimum value from the list elements
    //1.Way
    public static void getMinimumValueFromList1(List<Integer>nums){
        Integer min = nums.stream().distinct().reduce((t, u) -> t > u ? u: t).get();
        System.out.println(min);

    }
    //2.Way
    public static void getMinimumValueFromList2(List<Integer>nums){
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.println(min);

    }
    //3.Way
    public static void getMinimumValueFromList3(List<Integer>nums){
        Integer min = nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);

    }

    //4.Way
    public static void getMinimumValueFromList4(List<Integer>nums){
        Integer min = nums.stream().distinct().reduce((t,u)->Math.min(t,u)).get();
        System.out.println(min);

    }
   //11)Create a method to find the minimum value which is greater than 7 and even from the list
    //12 9 131 14 9 10 4 12 15  ==>10
    public static void getMinGreaterThanSevenEven(List<Integer>nums){
     Integer min =nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();

        System.out.println(min);
    }


}
