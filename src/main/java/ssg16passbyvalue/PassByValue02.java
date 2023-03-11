package ssg16passbyvalue;

public class PassByValue02 {
    public static void main(String[] args) {

        String question = "what is your level in java"; //?
        //putQuestion mark after this statement.

        String newQuestion= question.concat("?");
        System.out.println(newQuestion);
        //System.out.println(result);

    }
    private  static String putQuestion(String str){
        return str+ "?";
    }
}
