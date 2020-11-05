package chapter12;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 12:29 2020/5/29
 */
public class ReturnFinally {
    public static void f(int i){
        try {
            System.out.println("第一");
            if(i==1) return;
            System.out.println("第二");
            if(i==2) return;

        }
        finally {
            System.out.println("完成");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            f(i);
        }
    }
}
