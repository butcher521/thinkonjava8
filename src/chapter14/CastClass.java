package chapter14;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:13 2020/5/30
 */
class Building{}
class House extends Building{}
public class CastClass {

   static void test(/*Object x*/){
     /*  System.out.println("获取x的类对象"+x.getClass());
       System.out.println("x是否是父类的实例"+(x instanceof Building));
       System.out.println("x是否是子类额实例"+(x instanceof House));
       System.out.println("动态基类实例"+ Building.class.isInstance(x));
       System.out.println("动态子类实例"+House.class.isInstance(x));
       System.out.println("x.getclass==Building.class"+(x.getClass()==Building.class));*/

   }

    public static void main(String[] args) {
        for (Method method : CastClass.class.getMethods()) {
            method.setAccessible(true);

            System.out.println(method);
        }
        for (Field declaredField : CastClass.class.getDeclaredFields()) {
            declaredField.setAccessible(true);
            System.out.println(declaredField);
        }
    }
}
