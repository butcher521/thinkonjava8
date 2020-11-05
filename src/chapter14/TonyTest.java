package chapter14;

import chapter10.ClassInterface;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 20:46 2020/5/29
 */
interface A1{}
interface A2{}
interface A3{}
class Tony{
    Tony(){}
    Tony(int i){}
}
class FancyTony extends Tony implements A1,A2,A3{
    FancyTony(){
        super(1);
    }
}
public class TonyTest {
    static void printInfo(Class cc){
        System.out.println("类名"+cc.getName());
        System.out.println("简单类名"+cc.getSimpleName());
        System.out.println("全类名"+cc.getCanonicalName());
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class c=null;
            try {
                c=Class.forName("chapter14.FancyTony");
            } catch (ClassNotFoundException e) {
                System.out.println("找不到类");
            }
            printInfo(c);
        for (Class anInterface : c.getInterfaces()) {
            printInfo(anInterface);
        }
        Class up=c.getSuperclass();
        Object obj=null;
        try{
            obj=up.newInstance();
        }catch (InstantiationException e){
            System.out.println("不能实例化");
        }catch (IllegalAccessException e){
            System.out.println("非法访问");
        }
        printInfo(obj.getClass());
        System.out.println("=============");
        Class<FancyTony> ac = FancyTony.class;
        FancyTony fancyTony = ac.newInstance();
        Class<? super FancyTony> superclass = ac.getSuperclass();



    }
}
