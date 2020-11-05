package chapter05;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 9:54 2020/5/23
 */
public class ConstructionTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            /*new Rock();*/
            new Rock(i);
        }
    }

}
class Rock{
   /*  Rock() {
        System.out.println("rock");
    }*/
    Rock(int i){
        System.out.println("Rock"+i);
    }

}
