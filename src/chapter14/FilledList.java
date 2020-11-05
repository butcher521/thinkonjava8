package chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 9:47 2020/5/30
 */
class CounterInteger{
    private static long counter;
    private final long id=counter++;
    public String toString(){
        return Long.toString(id);
    }
}
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type=type;
    }
    public List<T> creat(int length){
        List<T> list=new ArrayList<>();
        for (int i = 0; i < length; i++) {
            try {
                list.add(type.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FilledList<CounterInteger> list=new FilledList<>(CounterInteger.class);
        System.out.println(list.creat(10));
    }
}
