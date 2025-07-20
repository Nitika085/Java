import org.w3c.dom.ls.LSOutput;

class outer {
    void meth1() {
        System.out.println("hello outer");
    }

    int x = 10;

    class inner {
        int y = 20;

        void meth2() {
            System.out.println("hello inner");
        }

    }

    inner i = new inner();

    void meth3() {
        System.out.println(i.y);
    }
    void meth4(){
        class localinnerclass {
            void display(){
                System.out.println("local inner class is local the method ");
            }


        }
        localinnerclass i=new localinnerclass();
        i.display();


    }

}
abstract class outer1{
    abstract void meth();
}
class outer2
{
    int x=9;
    static int y=8;
    static class inner{
        void display(){
            System.out.println(y);
        }

    }

}





public class Insideclasses {

    public static void main(String[] args) {
        outer o = new outer();
        o.meth1();
        o.meth3();
        o.meth4();
        outer1 o2= new outer1() {
            @Override
            void meth() {
                System.out.println("nitika");
            }
        };
        o2.meth();
        outer2.inner t=new outer2.inner();
        t.display();



    }
}
