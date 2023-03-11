package mehmet_day27_encapsulationabstruct;

public class StudentRunner {
    public static void main(String[] args) {
      //Student 1
      Student myStd = new Student();
      String stdId=myStd.getStdId();
        System.out.println(stdId); //AC123
        System.out.println(myStd.getGpa()); //4.0
        System.out.println(myStd.isPoor());


       //Student 2
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);






    }
}
