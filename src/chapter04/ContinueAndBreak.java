package chapter04;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 22:23 2020/5/22
 */
public class ContinueAndBreak {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {/*寻找89之内的不是7的倍数*/
            if(i==89){
                break;
            }
            if(i%7==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
