package chapter07;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 19:49 2020/5/23
 */
public class SpaceShipControl {
    void up(int velocity){}
    void down(int velocity){}
    void left(int velocity){}
    void right(int velocity){}
    void shutDown(int velocity){}
}
class SpaceShip{
    private String name;
    /*将目标的对象置位代理类的成员变量*/
    private SpaceShipControl spaceShipControl=new SpaceShipControl();
    SpaceShip(String name){
        this.name=name;
    }
    /*代理方法,用一个代理的方法区调用目标的方法*/
    void up(int velocity){
        spaceShipControl.up(velocity);
    }
    void down(int velocity){
        spaceShipControl.down(velocity);
    }
    void left(int velocity){
        spaceShipControl.left(velocity);
    }
    void right(int velocity){
        spaceShipControl.right(velocity);
    }
    void shutDown(int velocity){
        spaceShipControl.shutDown(velocity);
    }

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip("神舟");
        ship.down(122);
    }

}
