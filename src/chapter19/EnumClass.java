package chapter19;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:02 2020/6/3
 */
public enum  EnumClass {
    BIG,MIDDLE,SMALL
}
class Test{
    public static void main(String[] args) {
        for (EnumClass s : EnumClass.values()) {
            System.out.println(s);
        }
        for (String s : "你 好 马".split(" ")) {
            EnumClass i = Enum.valueOf(EnumClass.class, s);
            System.out.println(i);
        }
    }
}
