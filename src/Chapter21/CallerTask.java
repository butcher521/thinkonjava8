package Chapter21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:03 2020/6/5
 */
public class CallerTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "hello";
    }

    public static void main(String[] args) {
        FutureTask<String> stringFutureTask = new FutureTask<>(new CallerTask());
        new Thread(stringFutureTask).start();
        try {
            String result = stringFutureTask.get();/*获取执行结果！就是call方法的返回值！*/
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
