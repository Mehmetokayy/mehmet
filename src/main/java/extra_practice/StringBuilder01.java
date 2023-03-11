package extra_practice;

public class StringBuilder01 {
   /*
   Java'da String, "String Class" kullanilarak veya "StringBuilder Class" kullanilarak olusturulabilir.
   "String Class" Kullanilarak urettiginiz String'ler "Immutable"(Degistirilemez)dir.
   "StringBuilder Class" kullanilarak urettiginiz String'ler "Mutable"(Degistirilebilir)dir.

    */



    public static void main(String[] args) {

        //Immutable
        String s = "Memoli";
        String t = s + "!";
        String w = t + "?";


        //String'i degistirdikten sonra ayni String assighn ederseniz, Java yine yeni bir countainer olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyle eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.

        //Mutable
        //StringBuilder kullanilarak String uretmenin 1.Yolu:
        StringBuilder sb = new StringBuilder("Python");
        //Append: yapistirma anlamina gelir.
        sb.append("!").append("m").append(".");

        System.out.println(sb); //Python!m.

        //StringBuilder kullanilarak String uretmenin 2.Yolu:
        StringBuilder sb2 = new StringBuilder();

        sb2.append("Java");
        sb2.insert(3,"ci");
        System.out.println(sb2);

        //toString() method'u StringBuilder'i String'e cevirir.
        //String Class'da var olan ama StringBuilder Class var olmayan split() method gibi
        //method'lara ihtiyac duydugumuzda toString() method'unu kullanarak String Class gecer ve o method'lari kullaniriz.
        sb2.toString().split("v");


       //Mulakat sorusu; ters yazdirmayi nasil yapabilirsiniz?
        // Iki sekilde ters yazdirma yapilabilir.
        //i)StringBuilder de "reverse()" methodu veya for loop methodu ile yapilabilir.

        sb2.reverse();

        System.out.println(sb2);


        sb2.deleteCharAt(2);

        System.out.println(sb2);


        //day24 bitti!

    }
}
