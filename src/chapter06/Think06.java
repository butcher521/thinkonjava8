package chapter06;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 12:40 2020/5/23
 *
 * 第六张 访问权限修饰符
 * 权限修饰符的存在很好的保证了java代码的封装性；
 * private protected default public
 * 类库library 均放入包package中，需要使用的时候只要需要import导包语句；
 * 否则对于导入的类就要输入全限定类名，很麻烦；包还限制了类的同名问题；
 * 一个java源代码中只能有一个public的类，一个源码只有一个.java文件，却可能有多个.class文件；
 * 每一个java源文件都必有有一个包的信息 package；package语句必须是文件的头一行代码；
 * 包名一般设置为域名的倒序；这样就是独一无二的；
 * 如果两个不同的包中有一个相同的类，导入了类的额时候一定要显示的导出，不能加入*符号；
 * 静态导包可以直接导入类的静态方法，不需要该类的调用；
 *
 * 权限修饰符：
 * 私有的修饰符只有在类中才能修改，该类的对象在其他类不能访问该类的任何属性；
 * 此时设置访问器set get方法；
 * 继承权限等于包权限加上继承权限；
 *一个类不要设置为private和protected，做好是对类中的数据进行私有化；
 *对于一个类的额私有构造器，可以再类中定义静态的方法来获取类的对象；
 * 这就是单例设计模式，始终创建他的一个对象；
 *
 *
 *
 */
public class Think06 {
}
