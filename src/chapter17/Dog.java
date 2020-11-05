package chapter17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:05 2020/6/3
 */
public class Dog {
    protected int num;
    public Dog(int num){
        this.num=num;
    }

    @Override
    public String toString() {
        return "dog"+num;
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Dog && num==((Dog) obj).num;
    }
}
class Prediction{
    private static Random random=new Random(47);
    private boolean shadow = random.nextDouble()>0.5;

    @Override
    public String toString() {
        if(shadow){
            return "下雪了";
        }else {
            return "春天来了";
        }

    }
}
class Test{
    public static <T extends Dog> void predicate(Class<T> type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<T> constructor = type.getConstructor(int.class);
        HashMap<Dog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(constructor.newInstance(i),new Prediction());
        }
        System.out.println(map);
        Dog d = constructor.newInstance(3);
        System.out.println(d);
        if (map.containsKey(d)){
            System.out.println(map.get(d));
        }else {
            System.out.println("找不到"+d);
        }
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        predicate(Dog.class);
    }
}
