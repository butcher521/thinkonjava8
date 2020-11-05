package chapter14;

import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:38 2020/5/29
 */
class Init{
    static final int staticFinal=47;/*编译器常量！*/
    static final int staticFinal2=ClassInitial.random.nextInt(100);/*非编译期常量*/
    static {
        System.out.println("一号初始化完毕");
    }
}
class Init2{
    static int staticNonFinal=147;
    static {
        System.out.println("二号初始化完毕");
    }
}
class Init3{
    static int staticNonFinal=74;
    static {
        System.out.println("3号初始化完毕");
    }
}
public class ClassInitial {
    public static Random random=new Random(47);

    public static void main(String[] args) throws Exception {
        Class<Init> initClass = Init.class;
        System.out.println("创建引用");/*没有出发初始化*/
        System.out.println(Init.staticFinal);
        System.out.println("====================");
        System.out.println(Init.staticFinal2);/*先初始化，在访问！*/
        System.out.println("====");
        System.out.println(Init2.staticNonFinal);
        System.out.println("====");
        Class<?> aClass = Class.forName("chapter14.Init3");
        System.out.println(Init3.staticNonFinal);



    }
}
