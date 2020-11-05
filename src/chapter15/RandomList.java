package chapter15;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 18:02 2020/5/30
 */
public class RandomList<T> {
    private ArrayList<T> list=new ArrayList<>();
    private Random random=new Random();
    public void add(T item){
        list.add(item);
    }
    public T select(){
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {
        RandomList<String> list = new RandomList<>();
        for (String s : "你好啊 构造 我不好 鬼铠".split(" ")) {
            list.add(s);
        }
        for (int i = 0; i < 4; i++) {
            String select = list.select();
            System.out.println(select);
        }
    }
}
