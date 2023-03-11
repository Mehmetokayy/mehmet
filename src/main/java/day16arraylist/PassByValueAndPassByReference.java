
package day16arraylists;

public class PassByValueAndPassByReference {

    public static void main(String[] args) {

        /*
        1)PassByValue creates a copy of the value and uses the copy in the method.
        That is why methods can change just the copy not the original value.
        Java uses PassByValue to protect original values.

        2)Some programming languages  like C# use PassByReference.
        PassByReference creates the copy of the reference (address of the object) and use the copy as if a real assigned value
        in methods.
        Copy reference and Original reference point the original value that is why original value is updated by the methods.
        If you use PassByReference, you can not protect original values.
         */
        int shirtPrice=100;
        studentShirtPrice(shirtPrice, 10 );//90
        System.out.println(shirtPrice);
        veteransDiscount(shirtPrice, 20);
        System.out.println(shirtPrice);

        String name= "Ajda";

        String result= putExclamationMark(name);
        System.out.println(result);
        System.out.println(name);

    }

    public static void studentShirtPrice(int shirtPrice, int discount){
        int discountedPrice= shirtPrice- discount;
        System.out.println(discountedPrice);
    }
    public static void veteransDiscount(int shirtPrice, int discount){
        int discountedPrice= shirtPrice - discount;
        System.out.println(discountedPrice);
    }
    public static String putExclamationMark(String name){
        return name + "!";


    }











}