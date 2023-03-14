package extra_loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ex1: 1'den 100'e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz

        for (int i = 1; i <101 ; i++) {
            if(i%6 ==0){
                continue;//bosver

            }
            System.out.print(i + " ");
        }
        System.out.println();
       //Interview:  size verilen bir string'i ters ceviren kodu yaziniz

        String str="Mehmet";
        String ters="";

        for (int i =str.length()-1; i>-1; i--) {
            char harf=str.charAt(i);
            ters+=harf;
        }
        System.out.println(ters);




    }
}
