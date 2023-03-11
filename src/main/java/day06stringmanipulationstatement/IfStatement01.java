package day06stringmanipulationstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        /*
        If you study hard, you will get offer soon
        Note: To execute our codes under some conditions we use "if-statement"
        */


        //Example 1: If a number is positive, print positive on the console
        int a = 12;

        //1.Way:

        if(a>0){
            System.out.println("positive");


        }
        if(a<0){
            System.out.println("Negative");
        }
        if(a==0){
            System.out.println("Neutre");
        }
        //2.Way:
        if(a>0){
            System.out.println("Positive");


        }else if(a<0){
            System.out.println("Negative");
        } else if (a==0) {
            System.out.println("Neutre");
        }


    }
    }