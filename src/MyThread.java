class my implements Runnable
{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }

}
//
//public class MyThread extends Thread{
//    public void run(){
//        int i=1;
//        while(true){
//            System.out.println(i+" Hello");
//            i++;
//        }
//    }
//    public static void main(String[] args){
//        MyThread m=new MyThread();
//        m.start();
//        int i=1;
//        while (true){
//            System.out.println(i+" World");
//            i++;
//        }
//    }
//}


public class MyThread {
    public static void main(String[] args){
        my m=new my();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while (true){
            System.out.println(i+" World");
            i++;
        }
    }
}
