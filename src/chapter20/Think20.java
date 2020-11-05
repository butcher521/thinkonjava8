package chapter20;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:08 2020/6/4
 * 第20张  注解
 * 元数据 为我的代码中添加信息听哦难过了形式化的方法；
 * 语法比较简单：在前面有@符号；
 * 三个基础的注解，在lang包下： 重写的@override  过时的@Deprecated  压制警告 @SuppressWarnings
 *
 * 注解的定义：看起来像是接口的定义：编译器当做。class文件；
 * 注解就像是一个空的接口，但是需要元素注解的修饰，常见的Target 作用域，有一个枚举类ELementtype；
 * retention 里面有一个retentionPolicy；class source runtime；
 *以上就是注解的元素。没有元素的注解成为标记标记纾解；
 * 注解中的元素貌似方法的定义；抽象方法; 注解元素使用类似于键值对，用等号和逗号隔离；
 * java设置了3种标准注解，4中元注解
 * 3标准： override Deprecated SuppressWarnings
 * 4元注解（在注解定义上的注解） target ： type construction method field local variable parameter package
 * retention 在什么级别保存注解 source 在编译器丢弃 class 在字节码文件保留，在运行时被vm丢弃 runtime 任何时候保留
 *  documented 注解包含于javajoc中
 *  inherited 允许子类继承！
 *
 *  创建和使用注解处理器：
 *  类对象的获取某个方法，构造器，实例等，再获取注解 getAnnotation
 *
 *  注解元素：所有的额基本元素，String Class Enum Annotation 以及以上的数组；
 *  注意：不允许使用包装类；
 *  注解元素要么有确定的值，要么是default ，含有默认值；非基本类型的额元素不能是null；
 *  如果某个元素不存在，可以设置为-1 或者空的字符串""
 *
 *  基于注解的单元测试：JUnit
 *
 *
 */
public class Think20 {
}
