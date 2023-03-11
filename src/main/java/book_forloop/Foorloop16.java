package book_forloop;

public class Foorloop16 {
    public static void main(String[] args) {
//Type all characters before the first occurrence of 'm' in a String

     String s = "Christmas";
        String st="";
        for(int i=0; i<s.length();i++){
            if(i==s.indexOf('m')){
                break;
            }else{
                st+= s.substring(i,i+1);
            }

        }
        System.out.println(st);





    }
}
