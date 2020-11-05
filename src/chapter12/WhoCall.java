package chapter12;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:28 2020/5/29
 */
public class WhoCall {
    static void f(){
        try {
            throw new Exception();
        }catch (Exception e){
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement);
            }
        }
    }
    static void g(){
        f();
    }
    static void h(){
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("===================");
        g();
        System.out.println("======================");
        h();
    }
}
