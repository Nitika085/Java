//abstract class
abstract class Super{

    Super(){
        System.out.println("Super");
    }
    void meth1(){
        System.out.println("Super meth1");
    }
    abstract void meth2();


}
//concrete class
class sub extends Super{

    void meth2(){
        System.out.println("sub meth2");
    }
}

public class Abstract_class {
    public static void main(String[] args){
        Super s;//make reference of abstract but noe object of the abstract class
        s= new sub();
        s.meth1();
        s.meth2();

    }
}
