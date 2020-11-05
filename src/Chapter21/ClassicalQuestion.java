package Chapter21;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:10 2020/7/17
 */
public class ClassicalQuestion {


    public static void main(String[] args) {
        ArrayList<Integer> queue = new ArrayList<>();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (queue) {
                    while (queue.size()==10){
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    queue.add(new Random().nextInt(10));
                    queue.notifyAll();
                }

            }
        });
        Thread consumer=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (queue){
                    while (queue.size()==0){
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    queue.remove(new Random().nextInt(10));
                    queue.notifyAll();
                }
            }
        });
    }
}
