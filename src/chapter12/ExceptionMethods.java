package chapter12;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:22 2020/5/29
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try{
            throw new Exception("我的异常");
        }catch (Exception e){
            System.out.println("捕获异常");
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace(System.out);

    }
    }
}
