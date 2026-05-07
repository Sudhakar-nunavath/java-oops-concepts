package encapsulationclass;

public class MainMathodToRun {


    public static void main(String[]args){


        Teacher teacher1=new Teacher();

        teacher1.setId(88);
        teacher1.setName("Warrior");
        teacher1.setQualification("B-Tceh");
        teacher1.setSalary(1000000.03);

        System.out.println("Student 1 data"+ teacher1);
        System.out.println("Student name+  "+teacher1.getName());

    }
}
