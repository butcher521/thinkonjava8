package chapter12;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:41 2020/5/28
 */
class SimpleException extends Exception{
    public SimpleException(){}
    public SimpleException(String message){
        super(message);
    }
}
public class InheritException {
    public void f() throws SimpleException{
        System.out.println("f抛出异常");
        throw  new SimpleException("有问题");
    }

    public static void main(String[] args) {
        InheritException inheritException = new InheritException();
        try{
            inheritException.f();
        }catch (SimpleException a){
         a.printStackTrace();
        }
    }
}
