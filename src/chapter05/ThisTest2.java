package chapter05;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:17 2020/5/23
 */
public class ThisTest2 {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
class Person{
    public void eat(Apple apple){
        Apple peeledApple = apple.getPeeled();
        System.out.println("吃苹果");
    }
}