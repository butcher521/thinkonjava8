package chapter13;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:16 2020/5/29
 *
 * 第十三章 字符串
 * String 类是final修饰的，不可继承，也不可变！咱字符串上的操作只是创建可一个新的字符串罢了；
 * 每次在方法上就是传递一个String对象的引用，而这个引用每次又赋值一份来进行操作！
 * 源引用并没有被修改；
 * String中的+和+= 进行了操作符的重载，这是唯一的重载！
 * 前面提到了，如果第一个是字符串拼接，后面的全是拼接，而不是数字的加法！！
 * 方法的重载底层是引入了StringBuilder的append方法！每次都调用！！
 * 使用StringBuilder进行字符创的生成而已优化性能！
 *反编译，将机器码转为汇编语法！javap -c  字节码文件！
 * StringBuilder中常用的额append，delete，toString等方法！比简单的字符串操作更加有效率；
 * StringBuilder是线程不安全的，StringBuffer是线程安全的；
 * 一般的类都自己重写了toString，所以输出的结果都是对象的内容；
 * 如果想输出对象的地址信息，可以自己重写方法，
 * 不能使用this关键字，这会出现递归调用，使得出现方法栈溢出，应该调用父类的toString
 * 这是一个最初的版本，没有重写，就是输出的对象本身的信息！
 * 常见的操作注意replace中的正则表达式的替换！还是字符序列就是字符串；
 *
 * 格式化输出！
 * 就会说c语言风格的printf 或者 System.out.format()
 * 格式化就是使用占位符，这个就是正则表达式！其中正则表达式使用引号包裹，数字使用逗号分隔；
 * 常用的格式修饰符： %d 表示10内的整数！%f 表示浮点数！
 * 换行符\n %x为16进制的整数！
 *
 * java中所有的格式化都在Formatter类中！之中的额format方法，就是将格式化形式和参数列出；
 *在Formatter的构造器中最常见重载参数还是打印输出流， System.out   就是PrintStream
 *String类中的静态方法format和Formatter中的额方法一致，用起来比较方法！
 *
 * 正则表达式：主要是来描述查找字符串；也是一门语言！
 * 正则表达式中的\在java中写作\\，要对请进行转义！
 * \\d 表示数字 \n\t还是正常的表示换行！
 * 一个或者多个为+   零个或者一个表示？  零个后者多个表示为*  注意+需要转义  \\+
 * 字符串类型中的matches方法,传递字符串正则表达式格式！来看是否匹配！
 *String 中的split方法输入正则表达式，分割为字符串是数组！
 * \w 单词 \W非单词，用用来找标点符号！   \d 数字 \D非数字
 * |或操作！
 * 正则表达式的类在util包下的pattern；
 * String类中的replacefirst and replaceAll也是利用正则表达式进行替换！
 * 如果是单纯地替换就使用replace方法！
 * 常用的正则表达式字符类 .代表一个任意字符  [abc] 三选一  [^abc]初abc任选
 * \s表示空白字符 \S 非空白符  \d 十进制0-9  \w 一切的词字符 报错数字和字母；
 *
 * 量词贪婪型 举例 X{n} 正好n个x，x{n,}至少n个x；
 * String的政策表达式编辑能力弱，使用pattern中的静态方法compile方法区编译政策表达式！
 * 将给定的正则表达式付给pattern对象！
 * 调用matcher（）方法生成一个matcher对象
 *
 */
public class Think13 {
    public static void main(String[] args) {
    }
}
