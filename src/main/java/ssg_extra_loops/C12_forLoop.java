package ssg_extra_loops;

public class C12_forLoop {
    public static void main(String[] args) {
        /*
       Write the code that produces the following image using a for loop.
        ******
        *****
        ****
        ***
        **
        *

         */

        int number =10;
        for(int i=1; i<=number; i++){
            for(int j=number; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
