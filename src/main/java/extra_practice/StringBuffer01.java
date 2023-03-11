package extra_practice;

public class StringBuffer01 {
    public static void main(String[] args) {

        /*
        String olusturmak icin String Class, StringBuilder Class, ve StringBuffer kullanilabilir.
        1)StringBuffer Java'nin String uretmek icin olusturdugu ile Class'dir. Java 5 de uretilmistir.
        2)StringBuffer "synchronized"dir, StringBuilder "synchronized" degildir.
        3)StringBuffer "thread-safe" dir, StringBuilder "thread-safe" degildir.
        4)StringBuffer ve StringBuilder ikisi de mutable dir.

        Note 1: Immutable String lazim oldugunda String Class kullaniriz.
        Note 2: Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz.
        Note 3: StringBuffer "Multithread" ve "synchronization" lazim oldugunda tercih edilir.
                StringBuilder "Multiithread" ve "Syncronization" gerekmezse tercih edilir




            */

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);




    }
}
