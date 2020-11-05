package chapter13;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:27 2020/5/29
 */
public class StringOverLoad {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("你好啊");
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder/*.toString()*/);
    }
}
