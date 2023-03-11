package mehmet_day24_inheritince;

public class Car extends Vehicle{


    public String renk;
    int km;


    public Car(){

    }

    public Car(String renk, int km){
        super("Car");
        this.renk=renk;
        this.km=km;
        System.out.println("Car constructor");
    }
}
