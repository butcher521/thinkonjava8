package chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:05 2020/5/28
 */
public class Statistic {
    public static void main(String[] args) {
        Random random=new Random(47);
        Map<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int r = random.nextInt(20);
            Integer in = m.get(r);
            m.put(r,in==null?1:in+1);
        }
        Set<Integer> integers = m.keySet();
        for (Integer integer : integers) {
            Integer values = m.get(integer);
            System.out.println(integer+"  "+values);
        }
        System.out.println("=======================");
        Set<Map.Entry<Integer, Integer>> entries = m.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" "+value);
        }
    }
}
