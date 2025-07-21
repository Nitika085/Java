import static java.lang.Thread.sleep;

class Mydata {
    synchronized public void display(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        try {
            sleep(700);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("NITIKA");

    }

}
/**
 * Method Description
 *
 * @return return description
 * @throws Exception when this exception occurs
 * @author nitik
 * @since 28-06-2025
 */
class Mythread1 extends Thread{
    Mydata d;
    public Mythread1(Mydata d){
        this.d=d;
    }
   public void run(){
        d.display("Hello dosto ");
   }


}
class Mythread2 extends Thread{
    Mydata d;
    public Mythread2(Mydata d){
        this.d=d;
    }
    public void run(){
        d.display("My World");
    }


}

public class sync {
    public static void main(String[] args){
        Mydata data=new Mydata();
        Mythread1 t1=new Mythread1(data);
        Mythread2 t2=new Mythread2(data);
        t1.start();
        t2.start();


    }
}

//class MyData
//{
//     public void display(String str)
//    {
//        for(int i=0;i<str.length();i++)
//        {
//            System.out.print(str.charAt(i));
//            try{Thread.sleep(100);}catch(Exception e){}
//        }
//
//    }
//}
//
//class MyThread1 extends Thread
//{
//    MyData d;
//    public MyThread1(MyData d)
//    {
//        this.d=d;
//    }
//
//    public void run()
//    {
//        d.display("Hello World");
//    }
//
//
//}
//
//class MyThread2 extends Thread
//{
//    MyData d;
//    public MyThread2(MyData d)
//    {
//        this.d=d;
//    }
//
//    public void run()
//    {
//        d.display("Welcome All");
//    }
//
//
//}
//
//public class sync
//{
//    public static void main(String[] args)
//    {
//        MyData data=new MyData();
//
//        MyThread1 t1=new MyThread1(data);
//        MyThread2 t2=new MyThread2(data);
//
//        t1.start();
//        t2.start();
//
//
//
//    }
//}