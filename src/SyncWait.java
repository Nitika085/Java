class Mydata2 {
    synchronized public void display(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        try {
            System.out.println("\nThread going to wait: " + Thread.currentThread().getName());
            wait(); // releases the lock and waits
            System.out.println("Thread resumed: " + Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("NITIKA");
    }

    synchronized public void trigger() {
        System.out.println("Notifier running by: " + Thread.currentThread().getName());
        notify(); // wakes up one waiting thread
    }
}

class Mythread12 extends Thread {
    Mydata2 d;
    public Mythread12(Mydata2 d) {
        this.d = d;
    }
    public void run() {
        d.display("Hello dosto ");
    }
}

class Mythread2a extends Thread {
    Mydata2 d;
    public Mythread2a(Mydata2 d) {
        this.d = d;
    }
    public void run() {
        try {
            Thread.sleep(1000); // ensure Mythread12 waits first
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        d.trigger(); // this will call notify
    }
}

public class SyncWait {
    public static void main(String[] args) {
        Mydata2 data = new Mydata2();
        Mythread12 t1 = new Mythread12(data);
        Mythread2a t2 = new Mythread2a(data);
        t1.start();
        t2.start();
    }
}
