package ssg15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // q1. create an array and sort the numbers in the array from smallest to largest.

        int arr[]={9,8,5,1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        String name[]={"messi", "C.Ronaldo", "Pale"};



        //Example 3: Type code to check if a specific element exists in the array or not
        char ch[] = new char[4];
        ch[0] = 'A';
        ch[1] = 'Y';
        ch[2] = 'C';//binarySearch(X)
        ch[3] = 'I';


        int counter=0;
        for (char w:ch){
            if(w=='A'){

                System.out.println(w);
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("it is exist");
        }else{
            System.out.println("it is not exsist");
        }

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch)); //[A, C, I, Y]

        int idx=Arrays.binarySearch(ch,'X');
        System.out.println(idx);


        int idx1=Arrays.binarySearch(ch,'A');
        System.out.println(idx1);

       // Q4.  Create an integer array and  Find the sum of all elements.


        // 1st way


        //1 st way

        int num1[]={8,5,12,11,14};
        int sum = 0;
        for (int w: num1){
            sum = sum + w;
        }
        System.out.println(sum);


        //2.

      int total=0;
      for (int i =0; i<num1.length ; i++){
          total+=num1[0];
      }
        System.out.println(total);




    }
}
