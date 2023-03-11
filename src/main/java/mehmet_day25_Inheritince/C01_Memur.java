package mehmet_day25_Inheritince;

public class C01_Memur extends C03_Muhasebe{

    @Override
    public String toString() {
        return "C01_Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", calismaSaati=" + calismaSaati +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                ", personelNo=" + personelNo +
                '}';
    }

    public static void main(String[] args) {


        C01_Memur memur1 = new C01_Memur();


        //Personel class'i dedemden aldim
        memur1.isim="Osman";
        memur1.soyIsim="Sagir";
        memur1.adres="Izmir";
        memur1.telNo="36383149";
        memur1.personelNo=1233;
     //Muhasebe baba class'indan aldik
        memur1.calismaSaati=8;
        memur1.saatUcreti=20;
        memur1.statu="memur";
        System.out.println(memur1);



    }
}
