public class TwoThreadsDemo {
    public static void main (String[] args) {
        new SimpleThread("Bora Bora").start();
        new SimpleThread("Jamaica").start();
        new SimpleThread("Fiji").start();
    }
}

