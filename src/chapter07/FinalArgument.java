package chapter07;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:57 2020/5/23
 */
public class FinalArgument {
    void with(final Sun sun) {
        /*sun=new Sun();*/
    }

    void without(Sun sun) {
        sun = new Sun();

    }

    /*  int f(final int i){
         return i+1;
     }*/
    void f(final int i) {
        System.out.println(i);
    }


}
class Sun {
}