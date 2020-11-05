package chapter07;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 20:59 2020/5/23
 */
public class UpCast {

}
class Instrument{
    public void play(){
        System.out.println("玩乐器");
    }
     static void tune(Instrument i){
        i.play();
    }
}
class Wind extends Instrument{
    @Override
    public void play() {
        System.out.println("风琴");
    }

    public static void main(String[] args) {
        Instrument i=new Wind();
        Instrument.tune(i);
    }


}
