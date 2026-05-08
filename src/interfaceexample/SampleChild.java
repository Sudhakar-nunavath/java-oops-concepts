package interfaceexample;

public class SampleChild  implements SampleInterfaceEx,SampleInterface2{


    @Override
    public void sample4() {
        System.out.println("aaa is +  "+SampleInterfaceEx.add);
        System.out.println("Sample Implemention in sammple calsee");
    }

    @Override
    public void sample2() {
        System.out.println("aaa is +  "+SampleInterfaceEx.bbb);
        System.out.println("Sample Implemention in sammple calsee");
    }


    public void sample3() {
        System.out.println("aaa is +  "+SampleInterfaceEx.ccc);
        System.out.println("Sample Implemention in sammple calsee");
    }

    public void sample6(){
        System.out.println("Using multiInheritence usung interface");
    }
    public void sample5(){
        System.out.println("Using interface multiple inheritnec");
    }
}
