package chapter07;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 18:35 2020/5/23
 */
class Son extends Father{
    public Son(){
        super(12);
        System.out.println("子类构造方法");
    }
    public void print(int i){

    }

    public static void main(String[] args) {
       /* Son son = new Son();
        Father father=new Father();
        father.print();
        son.print();*/

        System.out.println("子类的main");


    }
}
public class Father {
    private String name="父类";

    public Father(int i) {
        System.out.println("父类构造方法");
    }

    public void print(int i){
        System.out.println("父类方法");
    }

    public static void main(String[] args) {
       /* System.out.println("父类的main");*/

    }
}

