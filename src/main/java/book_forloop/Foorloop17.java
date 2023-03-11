package book_forloop;

public class Foorloop17 {
    public static void main(String[] args) {
       // Type code to find the sum of the digits in an integer

        int n=753;
        int sum=0;


        for(int i=n; i>0; i=i/10){
            sum=sum +i%10;
        }
        System.out.println(sum);

    }
}
