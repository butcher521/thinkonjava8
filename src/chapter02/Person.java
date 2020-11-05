package chapter02;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("这是一个类的方法");
    }

    public static void main(String[] args) {
        Person person=new Person();
        String name = person.name;
        int age = person.age;
    }

}
class Test{
    public static void main(String[] args) {
        Person person=new Person();
        person.print();
    }
}
