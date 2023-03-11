package extra_access_modifier;

public class C02_kullaniciRunner extends C01_kullanici {
    public static void main(String[] args) {

        C01_kullanici k1=new C01_kullanici();
        System.out.println(k1.kullaniciId);
        System.out.println(k1.kullaniciAdi);
        System.out.println(k1.ePosta);


    }
}
