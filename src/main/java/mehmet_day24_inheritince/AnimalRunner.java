package mehmet_day24_inheritince;

import extra_practice.Monkey;

//Runner  genellikle "main" methodun oldugu classta olur.
public class AnimalRunner {

    /*

    1)"Inheritance" sayesinde
       i)Code tekrarlarindan kurtuluruz
       ii)Code tamiri(maintenance) kolay olur
       iii)Child Class'lari daha atomic yapmis oluruz

     2)Bir Class'i baska bir Class'in Child Class'i yapmak icin "extends" keyword kullanilir. Ilk yazilan Class Child, ikinci yazilan Class
       parent olur Parent Class'a "super Class" da denir

     3)Child Class object'leri Parent Class'dan method ve variable'lari
      kullanbilirler.

     4)Parent Class object'leri Child Class'dan method ve variable'leri kullanmazlar.

     5)Object Class her Class'in parent'idir.
     Jav da Object Class haric her Class'in parent'i vardir.
     Java'da parent'i olmayan tek Class Object Class dir


     */





    public static void main(String[] args) {

        Cat miyav = new Cat();

        miyav.eat();
        miyav.drink();
        miyav.breath();
        miyav.meow();


        Dog boncuk = new Dog();

        boncuk.eat();
        boncuk.drink();
        boncuk.breath();
        boncuk.bark();



        Bird mavis = new Bird();

        mavis.eat();
        mavis.drink();
        mavis.breath();
        mavis.twett();

        Monkey maymus =new Monkey();

        maymus.eat();//protected farkli package dan da olsa child class gorur.





    }






}
