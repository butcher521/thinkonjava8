package chapter03;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:40 2020/5/22
 */
public class AddString {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int z=2;
        String s="x+y+z";
        System.out.println(s);/*x+y+z*/
        System.out.println(s + x + y + z);/*x+y+z012*/
        System.out.println( x + y + z+s );/*3x+y+z*/
    }
}
