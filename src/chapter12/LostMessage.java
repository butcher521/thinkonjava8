package chapter12;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:01 2020/5/29
 */
public class LostMessage {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
           return;
        }
    }
}
