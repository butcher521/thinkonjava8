package chapter20;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:34 2020/6/4
 */
public class Testable {
    public void execute(){
        System.out.println("执行");
    }
    @Test
    void testExecute(){
        execute();
    }
}
