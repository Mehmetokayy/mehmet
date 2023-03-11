package ssg_extra_loops;

public class C13_forLoop {
    public static void main(String[] args) {
        /*
        Bir string'de benzersiz(tekrarsiz) karakterler yazdirmak icin kod yaziniz.
         */

        String str="Java Guzeldir";
        String str1="";
        for(int i=0; i<str.length(); i++){
            str1=str.substring(i,i+1);
            if(str.indexOf(str1)==str.lastIndexOf(str1)){
                System.out.print(str1+" ");
            }
        }



    }
}
