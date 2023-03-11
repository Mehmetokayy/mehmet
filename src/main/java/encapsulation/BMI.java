package encapsulation;

public class BMI {

    double weight;
    double height;


    public BMI(double weight, double height){

        this.weight=weight;
        this.height=weight;
        System.out.println("I am constructor!!! I am useful.");


    }


    public void calculateBMI(){
        double bmi=weight/(height*height);

        if (bmi<18.5){
            System.out.println("Underweight");
        } else if (bmi>=18.5 && bmi<25){
            System.out.println("Normal weight");
        }else if (bmi>=25 && bmi<30) {
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }



    }


}
 //underweight (under 18.5 kg/m2), normal weight (18.5 to 25), overweight (25 to 30), and obese (30 or more).