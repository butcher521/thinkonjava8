package chapter19;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:07 2020/6/3
 */


public class TrafficLight {
   Signal color=Signal.RED;
   public void change(){
       switch (color){
           case RED: color=Signal.GREEN;
           break;
           case GREEN:color=Signal.YELLOW;
           break;
           default:color=Signal.RED;

       }
   }

    @Override
    public String toString() {
        return "交通灯是"+color;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 10; i++) {
            System.out.println(trafficLight);
            trafficLight.change();
        }
    }
}
