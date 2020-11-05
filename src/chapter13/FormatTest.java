package chapter13;

import java.util.Formatter;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:12 2020/5/29
 */
public class FormatTest {
    private String name;
    private Formatter f;

    public FormatTest(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x,int y){
        f.format("%s 格式就是（%d,%d）\n",name,x,y);
    }

    public static void main(String[] args) {
        FormatTest formatTest = new FormatTest("构造器", new Formatter(System.out));
        formatTest.move(2,3);

    }
}
