package chapter03;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:09 2020/5/22
 */
public class AnotherName {
    static void f(Letter y){
        y.c='z';
    }
    public static void main(String[] args) {
        Letter letter=new Letter();
        letter.c='s';
        System.out.println(letter.c);
        f(letter);
        System.out.println(letter.c);

    }
}
class Letter{
    char c;
}
