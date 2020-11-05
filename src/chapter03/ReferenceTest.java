package chapter03;

import chapter02.Person;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:59 2020/5/22
 */
public class ReferenceTest {
    public static void main(String[] args) {
       Student student1=new Student();
       Student student2=new Student();
       student1.age=20;
       student2.age=10;
        System.out.println(student1.age+","+student2.age);
        student1=student2;
        student1.age=100;
        System.out.println(student1.age+","+student2.age);
        student2.age=1111;
        System.out.println(student1.age+","+student2.age);
    }


}
class Student{
    int age;
}
