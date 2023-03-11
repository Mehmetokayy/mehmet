package ssg11whiledowhileloop;

public class forWhileDoWhileLoop {
    public static void main(String[] args) {


        //Question 1) Print numbers 1 to 5 (including 3 and 8) on the same line

        //for loop
        for (int i =1; i <=5 ; i++){

            System.out.print(i+" ");
        }
        System.out.println("\n");
        //Zero ecusion

        int k=1;

        while (k<=5){
            System.out.print(k+" ");
            k++;

        }

      //do while


        int j=1;
        do{
            System.out.print(j+" ");
            j++;
        }while (j<=5);





    }
}
