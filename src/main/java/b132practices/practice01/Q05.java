package b132practices.practice01;

public class Q05 {
    public static void main(String[] args) {

        // Write a Java program to break an integer into a sequence of individual digits.
        //Hint: use / and %
        // x: input: 12345
        //  output:1
        //         2
        //         3
        //         4
        //         5

        int number=12345;

        int ones = number%10;
        System.out.println("ones = " + ones);
        int tens =number/10;
        int tens1=tens%10;
        System.out.println("tens1 = " + tens1);
        int hundreds=number/100;
        int hundreds1=hundreds%10;
        System.out.println("hundreds1 = " + hundreds1);
        int thousands=number/1000;
        int thousands1=thousands%10;
        System.out.println("thousands1 = " + thousands1);
        int tensOfThousands= number/10000;
        int tensOfThousands1=tensOfThousands%10;
        System.out.println("tensOfThousands1 = " + tensOfThousands1);





    }
}
