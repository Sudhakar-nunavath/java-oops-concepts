package classesandobjects;

public class Student {


    public int id;
    public String name;
    public String mail;
    public String add;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
