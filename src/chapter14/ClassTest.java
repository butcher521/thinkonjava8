package chapter14;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:39 2020/5/29
 */
class Sweet{
    static {
        System.out.println("sweet加载");
    }
}
public class ClassTest {
    public static void main(String[] args) {
        try {
            Class.forName("Sweet");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到类！");
        }
    }
}
