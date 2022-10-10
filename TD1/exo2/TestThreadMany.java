public class TestThreadMany {
    public static void main (String arg[]) {
        int val = Integer.parseInt(arg[0]);
        MyThread[] myThreads = new MyThread[val];
        for (int i=0; i<val;i++){
            myThreads[i] = new MyThread ("Thread #" + (i+1));
            myThreads[i].start();
        }
    }
}