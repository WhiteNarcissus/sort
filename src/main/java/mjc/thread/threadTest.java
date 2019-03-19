package mjc.thread;

/**
 * Created by gcb on 2019/2/14.
 */
public class threadTest {


    public static void main(String[] args) {
        hello h1 = new hello();
        hello h2 = new hello();
        hello h3 = new hello();
        h1.start();
        h2.start();
        h3.start();
         System.out.println("----------");
         hello2 my = new hello2();
        new Thread(my, "1号窗口").start();
        new Thread(my, "2号窗口").start();
        new Thread(my, "3号窗口").start();


        sleepThread s1 = new sleepThread();

       new Thread(s1).start();
    }

}
