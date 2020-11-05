package chapter13;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:54 2020/5/29
 */
public class OperatorString {
    public static void main(String[] args) {
        String s="ssewjfjfwfwe";
        String substring = s.substring(2, 7);
        s.contains(substring);
        String replace = s.replace("ss", "你好");
        System.out.println(replace);
    }
}
