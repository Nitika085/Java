class Myr extends Thread{
    public Myr(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        int i=1;
        while(true){
            System.out.println(i++ +"Mythread");

        }
    }

}

/**
 *
 */
public class ThreadsClasses {
    public static void main(String[] args){
        Myr m= new Myr("nitika");
        System.out.println(m.getName());
        System.out.println(m.threadId());
        System.out.println(m.getPriority());
        System.out.println(m.getState());
        System.out.println(m.isAlive());
        m.start();
       int c=1;
       while (true){
           System.out.println(c++ +"Main");
           Thread.yield();
       }


    }

}
