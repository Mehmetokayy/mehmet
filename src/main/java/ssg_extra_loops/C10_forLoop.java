package ssg_extra_loops;

public class C10_forLoop {
    public static void main(String[] args) {
        /*
        ex 10) input olarak girilen bir stringi forloop kullanarak ters cevirin
         */
        String input="Java Guzeldir";
        String str="";
        for(int i=input.length()-1; i>=0; i--){
            str+=input.substring(i,i+1);
        }
        System.out.println(str);



    }
}
