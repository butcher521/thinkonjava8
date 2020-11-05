package thread;

import java.util.HashMap;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:34 2020/7/19
 */
public class Local {
    static ThreadLocal<String> var=new ThreadLocal<>();
    static void print(){
        System.out.println(var.get());
        var.remove();
    }

    public static void main(String[] args) {
        Thread one=new Thread(new Runnable() {
            @Override
            public void run() {
                var.set("线程1");
                System.out.println(var.get());
                var.remove();
            }
        });
        Thread two=new Thread(new Runnable() {
            @Override
            public void run() {
                var.set("线程2");
                var.remove();
                System.out.println(var.get());
            }

        });
        one.start();
        two.start();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"sss");
        map.put(1,"sssss");
    }
}
