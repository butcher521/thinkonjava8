package chapter05;

import chapter02.HelloDate;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:43 2020/5/23
 */
public class Older {
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }

}
class Window {
    Window(int market) {
        System.out.println("Window" + market);
    }
}
    class House{
        Window w1=new Window(1);
        House(){
            System.out.println("house");
            Window w3 = new Window(33);
        }
        Window w2 = new Window(2);
        void f(){
            System.out.println("f()");
        }
        Window w3 = new Window(3);
    }

