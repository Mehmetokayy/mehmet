package extraencapsulation01;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable'ina
        //ulasabildim, degistirebildim ve cagirabildim
        arb1.marka="Toyota";
        System.out.println(arb1.marka);
        //access modifier kullanarak marka variable'ina ulasabildim.
        //tamamen serbest yapabilir ya da tamamen engelleyebilir.
        //Yani  access modifier ya hep ya hic diyor


        //model'i degistirelim ama gormiyelim
        //yakit turunu gorelim ama degistiremiyelim.

        arb1.setModel("Corolla");//Model olarak corolla'yi atadik.
        //model'i yazdirma imkansiz cunku getter methodumuz yok.
        System.out.println(arb1.getYakit());//Dizel bilgisini yazdirabildik
        //Ama yakit turunu degistirme imkanimiz yok cunku setter method'u yok


        //Ilk olarak variable'imizi private yapmamiz gerekiyor.
        //private variable'lara baska classlardan ulasmak mumkun olmadigindan
        //ikinci olarak set yetkisi icin setter, get yetkisi icin gettermethodlari olusturulur.






    }
}
