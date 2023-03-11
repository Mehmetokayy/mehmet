package day22overridingcapsilation;

public class Cat extends Mammal{

    @Override //Annotation(something start with "@" ==>Checks the overriding rules
    public void eat() {
        System.out.println("Cats eats....");
    }

    @Override
    public Animal creater() {
        return new Cat();
    }
}
