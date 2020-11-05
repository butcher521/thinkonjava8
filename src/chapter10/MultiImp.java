package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:41 2020/5/25
 */
class D{}
abstract class E{}
class Z extends D{
    E getE(){
        return new E() {
        };
    }
}
public class MultiImp {
}
