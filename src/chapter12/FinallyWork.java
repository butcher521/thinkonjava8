package chapter12;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:53 2020/5/29
 */
class ThreeException extends Exception{}
public class FinallyWork {
    static int count=0;

    public static void main(String[] args) {
        while (true){
            try {
                if(count++==0){
                    throw new ThreeException();
                }
                System.out.println("没有异常");
            }catch (ThreeException e){
                e.printStackTrace();
            }finally {
                System.out.println("finally块中");
                if(count==2) break;/*跳出循环*/
            }
        }
    }

}
