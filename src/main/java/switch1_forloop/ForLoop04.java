package switch1_forloop;

public class ForLoop04 {
    public static void main(String[] args) {

        /*
     Write code to print integers from 3 to 9 excluding 5
      */
   //1 way
        for(int i=3; i<10; i++){
            if(i!=5){
                  System.out.println(i);
            }

        }
        System.out.println("....................");
  //2 way
        for(int i=3; i<10; i++){

            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
