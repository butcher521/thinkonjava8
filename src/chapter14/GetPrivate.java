package chapter14;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:01 2020/5/30
 */
public class GetPrivate {
    private String name="你好";
    private int age=12;
    public void eat(){
        System.out.println("公共方法");

    }
    private void drink(){
        System.out.println("私有方法");
    }

    public static void main(String[] args) throws NoSuchMethodException {


    }
}
class TTT{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
      /*  Class<GetPrivate> aClass = GetPrivate.class;
        Method drink = aClass.getDeclaredMethod("drink");
       *//* drink.setAccessible(true);*//*
        drink.setAccessible(true);
       drink.invoke(new GetPrivate());*/
      /*  Class<GetPrivate> aClass = GetPrivate.class;
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method methods : declaredMethods) {
            System.out.println(methods);*/
        }


}
class Test{
    public static void main(String[] args) {
        Class<ArrayList> aClass = ArrayList.class;
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}