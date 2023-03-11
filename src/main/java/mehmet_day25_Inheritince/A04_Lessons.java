package mehmet_day25_Inheritince;

public class A04_Lessons  {


    public void liveSessions(){
        System.out.println("Online Dersler ");
    }

    public A04_Lessons() {
        System.out.println("Mehmet icin calissin");
    }//defaut bos const

    public A04_Lessons(String level){
        this();
        System.out.println("Derslerin seviyesi olur");
    }//parametreliconst.

}
