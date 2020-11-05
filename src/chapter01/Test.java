package chapter01;

public class Test {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape square=new Square();
        doSomething(square);/*典型的多态，运行看右边*/
        doSomething(circle);
    }
    public static  void doSomething(Shape shape){
        shape.draw();
        shape.eraser();
    }
}
