class LockTest {
    public synchronized void sleepMethod() {
        System.out.println(Thread.currentThread().getName() + " has entered sleepMethod.");
        try {
            System.out.println(Thread.currentThread().getName() + " is going to sleep for 5 seconds.");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " woke up and exiting sleepMethod.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void waitMethod() {
        System.out.println(Thread.currentThread().getName() + " has entered waitMethod.");
        try {
            System.out.println(Thread.currentThread().getName() + " is going to wait.");
            wait();
            System.out.println(Thread.currentThread().getName() + " was notified and exiting waitMethod.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SleepThread extends Thread {
    LockTest lock;

    SleepThread(LockTest lock) {
        this.lock = lock;
    }

    public void run() {
        lock.sleepMethod();
    }
}

class WaitThread extends Thread {
    LockTest lock;

    WaitThread(LockTest lock) {
        this.lock = lock;
    }

    public void run() {
        lock.waitMethod();
    }
}

class NotifierThread extends Thread {
    LockTest lock;

    NotifierThread(LockTest lock) {
        this.lock = lock;
    }

    public void run() {
        try {
            Thread.sleep(2000); // Give WaitThread time to call wait()
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " is calling notifyAll().");
            lock.notifyAll();
        }
    }
}

public class SleepVsWaitDemo {
    public static void main(String[] args) {
        LockTest lock = new LockTest();

        // SLEEP DEMO
        System.out.println("=== SLEEP DEMO ===");
        Thread t1 = new SleepThread(lock);
        Thread t2 = new SleepThread(lock);
        t1.setName("SleepThread-1");
        t2.setName("SleepThread-2");
        t1.start();
        t2.start();

        try {
            Thread.sleep(10000); // Let sleep demo finish before wait demo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // WAIT DEMO
        System.out.println("\n=== WAIT DEMO ===");
        Thread t3 = new WaitThread(lock);
        Thread t4 = new NotifierThread(lock);
        t3.setName("WaitThread");
        t4.setName("NotifierThread");
        t3.start();
        t4.start();
    }
}
