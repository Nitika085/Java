/**
 *
 */
class MyData1{
    int value;
    boolean flag=true;
    synchronized public void setv(int v)  {
        while (flag!=true){
            try {
                wait();
            }
            catch (Exception e){}
        }
        value=v;
        flag=false;
        notify();
    }

    synchronized public int getValue() {
        int x=0;

        while (flag!=false){
            try {
                wait();
            }
            catch (Exception e){}
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}
class producers extends Thread{
    MyData1 data;
    public producers(MyData1 d){
        data=d;
    }

    public void run(){
        int i=1;
        while(true){
            System.out.println("producer "+i);
            data.setv(i);
            i++;
        }

    }

}
class consumers extends Thread{
    MyData1 data;
    public consumers(MyData1 d){
        data=d;
    }
    int val;
    public void run(){
        while(true){
            val=data.getValue();
            System.out.println("consumers "+val);
        }

    }

}
public class ITC {
    public static void main(String[] args){
        MyData1 d1=new MyData1();
        producers p=new producers(d1);
        consumers c=new consumers(d1);
        p.start();
        c.start();
    }

}
