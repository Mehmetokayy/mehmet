package mehmet_day25_Inheritince;

public class C02_Isci extends C03_Muhasebe{
    public static void main(String[] args) {




        C02_Isci isci1 = new C02_Isci();
        isci1.isim ="Ebubekir";
        isci1.soyIsim="Can";
        isci1.adres ="Istanbul";
        isci1.telNo="7563479487";
        isci1.personelNo=200;




        isci1.calismaSaati=7;
        isci1.saatUcreti=30;
        isci1.statu="QA";
        System.out.println(isci1);
    }

    @Override
    public String toString() {
        return "C02_Isci{" +
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
}
