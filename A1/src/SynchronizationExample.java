// File: SynchronizationExample.java
class Counter {
    void displayCount(String threadName) {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(threadName + " - Count: " + i);
                try { Thread.sleep(400); } catch (Exception e) {}
            }
        }
    }
}

class MyThread extends Thread {
    Counter c;
    String name;
    MyThread(Counter c, String name) {
        this.c = c;
        this.name = name;
    }
    public void run() {
        c.displayCount(name);
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        Counter c = new Counter();
        MyThread t1 = new MyThread(c, "Thread A");
        MyThread t2 = new MyThread(c, "Thread B");

        t1.start();
        t2.start();
    }
}