package chapter22;

import chapter09.Apply;
import sun.dc.path.FastPathProducer;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:11 2020/7/11
 */
public class demo1 {
    public static boolean isGreen(Apple apple) {
        return "green".equals(apple.getColor());
    }
static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> predicate){
    ArrayList<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
        if (predicate.test(apple)){
            result.add(apple);
        }
    }
    return result;
}

    public static void main(String[] args) {

    }

}

class Apple {
    List<Apple> inventory = new ArrayList<Apple>();

    public String getColor() {
        return "red";
    }


}
