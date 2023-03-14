package extra_loops;

public class Loops01 {
    public static void main(String[] args) {

        //13. Session for loop    30 min
        //Interview Question

        //String karakterleri teker teker yazdiran ;
        //Eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz.

        String cen="Ogrenmek yasamin kanitidir";

        for (int i = 0; i < cen.length()-1 ; i++) {
            if(cen.charAt(i) =='t'){
                break;
            }
            System.out.print(cen.charAt(i));
        }



    }
}
