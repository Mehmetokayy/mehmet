package practice02dt;

public class Q01 {
    public static void main(String[] args) {


        //Type code to check if a String does not have any space character at the beginning at the end
        //Example==>'ALI' should print true on the console
        //           'ALI' should print false on the console


        String str="Tom ";

        String trimmmedString=str.trim();

        boolean result= str.equals(trimmmedString);

        System.out.println("Is there any space at the beginning and at the end? = " + !result);

    }
}
