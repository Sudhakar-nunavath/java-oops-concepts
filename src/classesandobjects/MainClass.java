package classesandobjects;

public class MainClass {

    public static void main(String[]args){
        System.out.println("Hello welcome to java Spring boot!");

        Student student1=new Student();

        System.out.println("student1 before assigning values: "+student1);

        Demo d1=new Demo();

        System.out.println("Non static key Word     "+ d1.abc);
        System.out.println("Static key Word    "+ Demo.xyz);

        d1.demo1();
        Demo.demo2();
    }

}
