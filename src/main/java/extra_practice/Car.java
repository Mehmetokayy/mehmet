package extra_practice;

public class Car {

    /*
       Constructor nedir?
       Class'dan object uretmemize yarayan code block'laridir.

       Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
       Ama bu constructor gozle gorulmez, gozle gorulmeyen(invisible) otomatik olarak Java tarafindan verilenbu constructor'lara
       "default constructor" denir.

       "default constructor"lar  "Car(){}" seklindedir.



       siz kendi constructor'inizi olusturdugunuzda Java dafault constructor'i siler.

       Bir class'da farkli parametreler kullanarak istediginiz kadar consructor olusturabilirsiniz.

       Farkli constructor'lar sayesinde bir klasdan farkli farkli objeler olusturabiliriz.


       Interview Sorusu: Method ile Constructor'in farki var midir? Varsa nedir?
       Cevap; Method ile Constructor farkli yapilardir.
            i)Method'larda "return type" vardir ama "constructor"larda "return type" yoktur.
            ii)Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
               Constructor'larin ismi ise her zaman     Class ismi ile ayni olmalidir.


     */






        String make = "Honda";
        String model = "Accord";
        int year = 2023;
        boolean hybrid = true;



     public    Car(String make, String model, int year, boolean hybrid){
            this.make=make;
            this.model=model;
            this.year=year;

        }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';


        //1:15

    }
}
