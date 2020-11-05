package Chapter21;

import javax.swing.*;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 9:37 2020/6/6
 */
public class YieldTest implements Runnable{
    YieldTest(){
        Thread thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread()+"正在执行！");
        System.out.println(Thread.currentThread()+"完事");
    }

    public static void main(String[] args) {
        new YieldTest();
       new YieldTest();

    }
}
