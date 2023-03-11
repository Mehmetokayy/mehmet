package day06stringmanipulationstatement;

public class StringManipulation03_r {
    public static void main(String[] args) {


        //Example 1: Type code to check if given String contains a specific character or characters
        //         "New York'  ==> w --> true


        String s= "New York";

        boolean r1=s.contains("w");

        System.out.println("Contain w " + r1);

        //Example 2: Type code to change the first occurrence of "java" to "python"
        //          java is java, l like java ==> python is java, l like java

        String t = " java is java, l like java";
        String r2=t.replaceFirst("java","python");
        System.out.println(r2); //python is java, l like java.

        //Example 3: Type code to repeat a given String
        //          "Java" 4 times ==> JavaJavaJavaJava

        String u = "Java";

        //1.Way:
        String u1 = u+u+u+u;

        //2.Way:
       String u2= u.concat(u).concat(u);

        String  u3= u.repeat(56);
        System.out.println(u3);




























    }
}
