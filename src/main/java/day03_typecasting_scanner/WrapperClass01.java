package day03_typecasting_scanner;

public class WrapperClass01 {
    public static void main(String[] args) {

        /*
        Wrapper Class
        They are Non-primitive data types. Non-Primitive have "values" and "methods".
        We can do many actions by using "methods", this is very useful.
        But primitives do not have any actions/methods with them.
        Java created a structre called Wrapper Class for primitive values and methods.

        Primitive Data                  Wrapper Class

        byte                             Byte
        short                            Short
        int                              Int
        long                             Long
        float                            Float
        double                           Double
        char                             Char
        boolean                          Boolean


         */

        int i= 12; //There is no method

        Integer number=456; //There are many methods

        char c= 'A';

        Character wc= 'A';


        //AutoBoxing: To convert "primitive data" to "wrapper class" of the primitive data
        byte b=23;

        System.out.println(b);
        Byte wb=b;
        Byte wrapperB=34;

        System.out.println(wb.floatValue());


        //Unboxing
        Short ws= 34;

        short s=ws;

        //How to get the minimum and maximum values of numeric data types in java
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Short.MAX_VALUE);   //32767

        System.out.println(Character.MAX_VALUE);//
        System.out.println(Character.MIN_VALUE);


    }
}
