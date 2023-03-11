package extra_practice;

public class StaticBlacks01 {

    //Bir variable olusturdugunuzda, deger atamazsaniz o variable'i "initialize" etmediniz demektir.
    //static vaiable'ler static block'lar icinde initialize edilirse o class'in icinde herseyden once hazir haler getirilmis olur
    //Bazen main method calistirilmadan once variaballerin hale getirilmesi gerekir bu yuzden static block'lar kullanilir.

    //Note 1: "static block" lar static variable'lari initizalize etmek icin kullanillar.
    //Note 2: "static block" lar class icinde "herseyden once" calistirilirlar.
   static double pi;

   static{
       pi = 3.14;
   }

    public static void main(String[] args) {
        pi =3.14;
    }
}
