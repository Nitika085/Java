interface I1{
     void meth1();
     void meth2();
     static int X=10;

}
class test implements I1{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }



}

public class Interfaces {
    public static void main(String[] args){
        test t=new test();
        t.meth1();
        t.meth2();
        I1 t2=new test();
        t.meth2();

    }

}
