package mehmet_day25_Inheritince;

public class C03_Muhasebe extends C04_Personel{//baba class=super class
    protected int saatUcreti;
    protected String statu;
    protected int calismaSaati=8;



    protected int maasHesapla(){
        int maas=saatUcreti*calismaSaati*30;
        return maas;


        //1:26
    }
}
