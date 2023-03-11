package day24interface;

public class CarRunner {

    public static void main(String[] args) {


        Honda myHonda = new Honda();

        myHonda.cool();
        myHonda.heat();
        myHonda.run();


        Ac.climate();


        //Ac my Ac= new Ac(); ==> 'Ac' is interface; cannot be instantiated

        System.out.println(Ac.price);
        //Ac.price++; ==> Cnnot assign a value to final variable 'price'
        System.out.println(Engine.price);



    }
}
