package day12_arrays_foreachloop;

import java.util.Arrays;

public class Arrays03_r {
    public static void main(String[] args) {

        //Example 1: Create a String array with 5 elements, delete the elements whose length is less than 5
        //    [Orange, Blue, Red, Yellow, Brown] ==> [Orange, Yellow, Brown]

        String[] colours= new String[5];

        colours[0]="Orange";
        colours[1]="Blue";
        colours[2]="Red";
        colours[3]="Yellow";
        colours[4]="Brown";
        int counter=0;
        for (String w: colours){

          if (w.length() >= 5){
              counter++;
          }

        }
        System.out.println(counter); //3

        String[] newArray= new String[counter];

        //transfer the elements whose lengths are greater than or equal to 5 into the newArray
        int idx=0;
        for (String w: colours){
            if (w.length()>=5){
                newArray[idx]=w;

                idx++;
            }
        }

        System.out.println(Arrays.toString(newArray));








    }
}
