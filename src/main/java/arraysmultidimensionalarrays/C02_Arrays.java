package arraysmultidimensionalarrays;

import java.util.Arrays;

public class C02_Arrays {
    //Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
    //a-e-i-o-u-A-E-I-O-U
    public static void main(String[] args) {

        String str="Java ogrenince para kazanmak ne kolay, ogrenmeyince nekadar zor";
        str=str.toLowerCase();
      String harfler[]=str.split("");

        System.out.println(Arrays.toString(harfler));
         int counter=0;
        //iter  --> for each loop

        for (String w : harfler) {

            switch (w){
                case"a":
                case"e":
                case"o":
                case"u":
                case"i":

             counter++;
            }
        }System.out.print(counter);




    }
}
