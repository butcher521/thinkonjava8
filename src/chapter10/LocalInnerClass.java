package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:47 2020/5/28
 */
interface Counter{
    int next();
}
public class LocalInnerClass {
    private int count=0;
    Counter getCounter(final String name){
        class LocalCounter implements Counter{
           LocalCounter(){
               System.out.println("内部类构造器");
           }
            @Override
            public int next() {
                System.out.println(name);
               return count++;
            }
        }
        return new LocalCounter();
    }
    Counter getCounter2(final String name){
        return new Counter() {
            {
                System.out.println("匿名内部类初始化");
            }
            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }

        };
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass=new LocalInnerClass();
        Counter counter = localInnerClass.getCounter("1");
        Counter counter2 = localInnerClass.getCounter2("2");


    }
}
