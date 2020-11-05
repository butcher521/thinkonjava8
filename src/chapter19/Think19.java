package chapter19;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:59 2020/6/3
 * 第十九章 枚举
 * 调用枚举的values方法可以返回一个枚举数组；
 *常见的方法： values获取数组，valueOf（）获取指定元素的内容；ordinal;获取名name
 * 静态的导包使得枚举的常量也是不用类来调用；
 * 枚举类不可以被继承；可以让里面添加方法！
 * switch语句中常使用枚举类作为变量；
 *任何枚举类都自动的额继承于Enum，但是这不能显示的继承别的类，但是可以实现某个接口！
 *枚举的class对象中 getEnumConstants，获取常量数组， 数组[random.nextInt(数组长度)]
使用接口组织枚举
 在一个接口中，使用分组枚举实现该接口！间接的实现了的枚举的子类；
可以实现枚举的枚举；
 在一个枚举类中有一个内部的就实现了枚举的子类分类；这个枚举了中包含了分类的枚举，这样便于管理！

 有一个EnumMap，map的键必须使用枚举的元素；
 可以为每一个枚举的实例编写方法，很有趣
 *
 */
public class Think19 {
}
