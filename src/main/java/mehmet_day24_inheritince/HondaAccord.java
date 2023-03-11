package mehmet_day24_inheritince;

public class HondaAccord {


    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(int price) {
        this.price = price;
    }

    public HondaAccord(int price, int year) {
        this.price = price;
        this.year = year;
    }

    public HondaAccord(int price, int year, String make, String model) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "HondaAccord{" +
                "price=" + price +
                ", year=" + year +
                '}';
    }
}//Class
