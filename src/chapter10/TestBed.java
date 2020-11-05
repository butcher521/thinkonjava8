package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:17 2020/5/25
 */
public class TestBed {
    public void f(){
        System.out.println("c测试方法");
    }
    public static class Test{
        public static void main(String[] args) {
            TestBed testBed = new TestBed();
            testBed.f();
        }
    }
}
