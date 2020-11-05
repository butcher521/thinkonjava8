package chapter08;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:10 2020/5/24
 */
public class PolyConstruction {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
class Glyph{
    void draw(){
        System.out.println("基类的draw");
    }
    Glyph(){
        System.out.println("方法之前构造器");
        draw();
        System.out.println("方法之后构造器");
    }
}
class RoundGlyph extends Glyph{
    private int radius=1;
    RoundGlyph(int r){
        radius=r;
        System.out.println("子类构造器调用"+radius);
    }
    void draw(){
        System.out.println("子类方法调用"+radius);
    }
}
