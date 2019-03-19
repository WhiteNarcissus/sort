package mjc.thread;

/**
 * Created by gcb on 2019/2/14.
 */
public class hello extends Thread {

    public void run() {
        for (int i = 0; i < 7; i++) {
            if (count > 0) {
                System.out.println("count= " + count--+"当前线程："+Thread.currentThread());
            }
        }
    }



    static  int count = 5;

}
