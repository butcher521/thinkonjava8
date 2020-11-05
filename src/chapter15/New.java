package chapter15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:26 2020/6/1
 */
public class New {
    public static <T> List<T> list(){/**/
        return new ArrayList<>();
    }
    public static <K,V> Map<K,V> map(){
        return new HashMap<>();
    }
    static <K,V>void f(Map<K,V> map){
        System.out.println("ooo");
    }

    public static void main(String[] args) {
        Map<String, Integer> map = New.<String, Integer>map();
    }
}
