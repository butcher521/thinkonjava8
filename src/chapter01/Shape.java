package chapter01;

public class Shape {
    public void draw(){
        System.out.println("父类的draw");
    }
    public void eraser(){
        System.out.println("父类的eraser");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个方形");
    }
}
