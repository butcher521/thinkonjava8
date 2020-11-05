package chapter19;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:21 2020/6/3
 */
enum OO{HHH,ZZZ}
public class Reflection {
    public static void analyse(Class<?> enumType){
        System.out.println(enumType);
        System.out.println("=============");
        for (Type t : enumType.getGenericInterfaces()) {
            System.out.println(t);
        }
        System.out.println("=============");
        System.out.println(enumType.getSuperclass());
        System.out.println("=============");
        for (Method method : enumType.getMethods()) {
            System.out.println(method);
        }
    }

    public static void main(String[] args) {
        analyse(OO.class);
    }
}
