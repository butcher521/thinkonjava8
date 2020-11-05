package chapter02;

public class StaticTest {
    private static Integer i=10;

    public static void main(String[] args) {
        StaticTest s1=new StaticTest();
        StaticTest s2=new StaticTest();
        System.out.println(s1.i.equals(s2.i));
    }
}
