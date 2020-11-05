package chapter12;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:26 2020/5/28
 *
 * 第12章 异常处理
 * 异常组织了当前的代码继续执行；
 * 将正常情况的执行和除了问题的解决方案分离，这就是异常处理的额高效；
 * 抛出异常，创建一个异常的对象，抛到更大的环境（上一级）中去处理；
 * 语法，在异常对象的构造器中传递字符串信息，描述异常的情况；
 * 关键字throw就是抛出这个异常对象的关键字；
 * 异常和错误的父类就是throwable
 * 异常的捕获
 * 将可能产生异常的代码放入try语句块中，在catch语句块中将得到处理；
 * catch接受一个异常的类型，多个同种的异常使用一个异常雷静就可以！
 * 产生自定义的异常只要继承exception即可
 * 一般在catch语句中调用异常的打印栈轨迹方法，默认错误输出流；
 * 此方法将异常方法的调用和异常的抛出位置标明；默认什么都不写，就是System.err；
 *
 * 异常说明：将方法抛出的异常告诉程序员，使用throws关键字在方法的后面
 * 异常要么抛出，要不自己处理；只要捕获基类的异常，所有的异常就都包含进去；
 * 但是全部包含的异常不会包含具体的信息，需要调用方法getMessage获取详细异常信息
 * 栈轨迹的详细信息通过getStackMessage，这返回一个数组，包含了详细的方法栈的信息；
 *
 * java中的标准异常 error和exception 其中error是编译和系统的错误不需要处理
 * exception中的运行期异常我们也不需要管，比如空指针异常，越界异常，内存溢出异常等；
 *虚拟机会自动的处理；
 * finally块存在就系希望五路tyr块的异常是否被抛出，finally的语句依然执行；
 *在try语句中发现异常就跳转到catch中捕获，后面的语句就无法执行，需要方法finally语句中；
 * 一般常在finally中释放资源！如果break语句和continue语句一起也是执行的；
 *
 * */
public class Think12 {
}