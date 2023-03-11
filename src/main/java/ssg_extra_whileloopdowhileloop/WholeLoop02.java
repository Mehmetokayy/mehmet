package ssg_extra_whileloopdowhileloop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WholeLoop02 {
    public static void main(String[] args) {

        //Kullanicidan bir tam sayi alip
        //bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun.

       // Scanner scan= new Scanner(System.in);
       // System.out.println("Please enter a number...");
      //  int num=scan.nextInt();

        int input = 20;
        int dived = 40;

        while (input<=dived){
            System.out.print(input + " ");
            input++;
        }
        System.out.println("\n");
        //2.way
        int num1=20;
        int num2=40;

        do{
            System.out.print(num1+" ");
            num1++;
        }while(num1<=num2);

        System.out.println("**************");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("B");
       // linkedList.addFirst("C");
       // linkedList.addFirst("B");


        linkedList.add(0, "X"); //[X, A, B, C, B]
        System.out.println(linkedList);   //[X, B, C, B]
                                        //Prints [X, A, B, C, B] on the console

        //  List<String> names = new ArrayList<>();
        List<String> c1= new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println(c1.isEmpty());

        //c1.removeAll(c1);
       // System.out.println(c1);
        ;
       // System.out.println(c1.remove(1));
        //System.out.println(c1);
        //prints false on the console
       // prints [ ] on the console




       // System.out.println( linkedList.remove());
      //  System.out.println(linkedList);
      //  System.out.println();
       // linkedList.add(2,"X");
       // System.out.println(linkedList);


    }
}
