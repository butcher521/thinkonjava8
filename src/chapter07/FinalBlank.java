package chapter07;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:45 2020/5/23
 */
public class FinalBlank {
    public static void main(String[] args) {
        Blank blank = new Blank();
        Blank blank1 = new Blank(10);
    }
}
class Pop{
    private int i;

    public Pop(int i) {
        this.i = i;
    }
}
class Blank{
    private final int i=0;
    private  final int j;
    private  final Pop pop;
    Blank(){
        j=1;
        pop=new Pop(1);
    }
    Blank(int x){
        j=x;
        pop=new Pop(x);
    }

}

