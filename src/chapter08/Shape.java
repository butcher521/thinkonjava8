package chapter08;

import javax.xml.ws.EndpointReference;
import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:27 2020/5/24
 */
public class Shape {
    public void draw() {
        System.out.println("画一个形状");
    }

    public void erase() {
        System.out.println("擦出形状");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个愿");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个正方形");
    }
}

class RandomFactory {
    private Random random = new Random();

    Shape next() {
        switch (random.nextInt(2)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();

        }

    }

}
class Test{
    private static RandomFactory randomFactory=new RandomFactory();

    public static void main(String[] args) {
        Shape[] shapes=new Shape[4];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i]=randomFactory.next();
        }
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
