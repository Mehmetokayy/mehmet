package ssg;

import java.util.Scanner;

public class WrapperClass01 {
    public static void main(String[] args) {



        /*

        Primitive                             Wrapper

        byte               ==>            Byte
        short              ==>            Short
        int                ==>            Integer
        long               ==>            Long
        float              ==>            Float
        double             ==>            Double
        boolean            ==>            Boolean
        char               ==>            Character




         */





        char ch = 'A';
        System.out.println(ch);

        Character memo=ch;
        System.out.println(memo);


        int num1=56;
        Integer num2=num1;

        //Ex: short data type'inin en kucuk ve en buyuk degerini ekrana yazdirin.

        System.out.println(Byte.MIN_VALUE + " " + Short.MAX_VALUE);



        Scanner input = new Scanner(System.in);
        System.out.println("Give me number...");
        int number1=input.nextInt();



        System.out.println("Give me second number...");
        int number2= input.nextInt();
        System.out.println("sum of num1 and num2" + number1+number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1%number2);



    }
}
