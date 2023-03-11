package day22overridingcapsilation;

public class Student {
    /*
       1)When we type code, we may need to hide some data for some reasons.
         "Encapsulation" means "hiding data"
     */


    public String stdName;
    int stdGpa;
    private String psychologicalIssues = "Depression";
    public String psychologicalIssues(){
          return psychologicalIssues;
    }






}
