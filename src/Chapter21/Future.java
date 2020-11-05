package Chapter21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 20:58 2020/7/17
 */
public class Future implements Callable<String> {

    @Override
    public String call() throws Exception {
        /*执行代码*/
        return "haahaha";
    }

    public static void main(String[] args) {
        FutureTask<String> fu = new FutureTask<>(new Future());
        new Thread(fu).start();
        try {
            String s = fu.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
