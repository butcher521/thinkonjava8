package chapter06;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 13:40 2020/5/23
 */
public class Sun {
    private Sun(){

    }
    static Sun getInstance(){
        return new Sun();
    }
}
class Moon{
    public static void main(String[] args) {
        Sun.getInstance();
    }
}
