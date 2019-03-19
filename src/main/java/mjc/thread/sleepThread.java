package mjc.thread;

import java.util.Date;

/**
 * Created by gcb on 2019/2/14.
 */
public class sleepThread implements Runnable {
    @Override
    public void run() {

            for (int i = 0; i < 100; i++) {
                if ((i) % 10 == 0) {
                    System.out.println("-------" + i);
                }
                System.out.print(i);
                try {
                    Thread.sleep(1000);
                    System.out.print("    线程睡眠"+new Date()+"\n");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


    }


}
