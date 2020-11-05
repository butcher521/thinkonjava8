package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:41 2020/6/4
 * 第21张 并发编程
 *并发编程使得程序（进程）划分为多个费力的，独立运行的额执行线程，简称线程；线程就是cpu调度的最要单位，进程是资源
 * 分配的最小单位；
 * 并发就是单处理器在时间上分片处理。是程序交替进行，使得cpu的效率最大；
 * 并行就是在多个处理器的情况下，多个程序同时进行；
 * 线程的定义必须实现 runnable接口，并且重写抽象方法run，线程的执行任务在run方法中；
 *线程调度  Tread.yield() 转让cpu的控制权；
 * 将runnable的实现类作为一个线程的方法就是，将是实现类的引用作为参数交个线程类Tread的构造器中！
 * 然后调用Thread中的start方法，就可以开启一个线程！这样就有两个线程，一个自己开启（run）的，一个默认的main线程！
 * 这个start就是对runnable实现类的方法run的调用！
 * 多线程进行输出的时候，会发现输出混在了一起，这就是线程之间对于cpu控制权的争夺；
 * 底层原理就是cpu的对线程的调度，Thread。yield；这种调度是不确定的；
 * 线程创建一个线程后，直到线程的执行完毕，垃圾回收机制不会处理它！
 * Thread对象的引用main方法并不会捕获！
 *JUC 并发包
 * util.concurrent 并发包下的执行器 executor 管理线程对象；
 * 执行器在客户端和任务之前提供了间接层，是中介对象去执行任务；
 * 执行器允许管理异步任务！cached
 *
 * 同步+阻塞：程序代码一行一行执行，上一行不执行完，下一行就不会被执行；如果上一行卡住了迟迟不结束（阻塞了），
 * 那么整块代码全部卡住。遇到这种代码的感觉就是程序突然卡住死机，小圈圈来回转，此时用户无法区分电脑是在冥想还是挂了，
 * 所以体验非常差。
 * 同步+非阻塞：这就是最常见的程序，一行一行序贯执行，且没有哪一行会出现卡死的情况。
 * 这种程序最符合人们对计算机程序的心理预期，也就是程序能做到“有问立答”。
 * 异步+阻塞：虽然代码中某些部分会卡住，但是由于采用了异步的处理方式
 * （包括callback、future、promise、reactiveX、async-await/coroutine），
 * 所以卡住行的下一行不会傻等，整个代码块也就不会卡住。这时虽然做不到有问立答，
 * 但是会给你一张小卡片上面写着“已受理，请稍等”，这种体验也不会太差。
 * 异步+非阻塞：非阻塞情况下一般不会采用异步编程，这个组合属于脱裤子放屁。
 * 但是在兼有阻塞非阻塞的代码块中，由于整块都可能采用异步编程，所以也会出现这种组合。
 * 体验上讲也是有问立答，只是会稍稍慢一点，但感觉不出来。
 *
 * 常见线城池 newCachedThreadPool newSingleThreadPOOl newFixThreadPool 返回一个ExecutorService
 *
 *
 * java并发编程之美
 * 一个进程中有多个线程，多个线程共性进程的堆和方法区资源，但是每一个线程私有均有自己的程序计数器和栈区；
 * 私有的程序计数器记录程序执行的地址，方法下次获取控制区继续执行；
 * 私有的栈资源储存线程的局部变量；以及线程的调用栈帧；
 * 线程共享的堆包含了所有的new的对象； 方法区中存放类，常量，静态变量的信息；
 *
 * 线程的创建：
 * 1.实现runnable接口，重写run方法：缺点：在run内部，必须使用Thread.currentThread 来获取线程对象的引用；
 * 有点：可以多继承！任务和代码分离：多个线程执行一个任务们只需要一个代码！
 * 多个线程类狗杂器中加入Runnable 实现类的对象引用即可！
 * 2，继承Thread类，重写run方法 :线程对象调用start,此时线程处于就绪状态，就差获取cpu资源了 ，
 * 一旦run方法执行完毕，线程终止；好处：在run方法中，直接this可获取线程对象；
 * 不能实现在一段代码中多个线程执行同一个任务！第二个线程执行会出现非法线程语句的警告！
 * 3.使用future Task方法！
 * 上面两种的run方法都是没有返回值的！
 * 一个线程任务是实现callable结构，泛型就是call方法的返回值！
 * 在主线程中创建FutureTask，在构造器张传递任务；
 * 开启线程传递 futureTask的对象引用（任务！）
 * 利用 futureTask的对象的get方法获取任务的返回值！
 *
 * 线程的通知和等待
 * 线程调用共享资源的wait，使得当前线程等待，直到其他线程调用共享对象notify 或者notifyAll，获取等待超时！
 * 或者其他线程调用该线程的interrupt中断方法，到时中断异常返回！
 * 调用对象wait方法，现获取对象的监视器锁：
 * 方法1：使用synchronized同步代码快，将共享资源作为参数！
 * 方法2：调用共享变量的方法，使用synchronized 修饰！
 * 线程的挂起和就绪如果因为其他原因唤醒，就叫做虚假唤醒，需要在同步代码块状中加入太偶见判断，不满足条件就一直等待！
 *当前线程调用共享资源的wait，只是会释放对当资源的监视器锁，该线程的其他资源不释放！
 * 当一个线程调用资源的额wait被阻塞挂起，在其他线程中中断该线程，获得中断异常！
 * 一个wait（long timeout），如果在指定的时间内没有被唤醒或者中断，到时间还是被返回！
 * wait方法就是wait（0）,此时就不考虑时间，等着其他线程来唤醒；
 * 参数必须是非负数，初夏负数则会出出现异常！
 * wait（timeout ，nanos）  线程阻塞，资源释放！！
 * 中断只是设置中断标志位true，且只有在sleep，join，wait阻塞是才会终止线程！
 *
 * 注意：线程调用一个共享变量的wait，这个线程会被挂起阻塞！这个共享资源就被释放了！，没有锁；
 * 如果此时别的线程调用共享对象的notify，那么有这个对象阻塞的所有线程就会被随机唤醒（1个！）
 * 被唤醒的线程必须重新获取共享资源的监视器锁（唤醒线程释放了锁），才能返回！这个过程也需要竞争，不确定哪个线程；
 * notify也是需要获取共享资源的监视器锁；
 * 注意；notify唤醒一个，notifyAll唤醒所有的线程；
 *
 * join方法是线程的非静态方法，等待一个线程的结束，那个县城调用会舍得该线程组设明知道某个线程执行完毕！
 * 举例：在主线程中，线程a调用join；name主线程组设知道线程a执行完，或者，在别的线程中，主线程调用中断，interrupt方法；
 * 改变主线程的中断标志！等和中断，线程的阻塞需要另外一个线程的参与！帮助阻塞或者提供中断唤醒；
 *
 * 线程中静态方法sleep,睡眠线程！指定的时间段内不再抢占cpu的控制权；线程阻塞挂起；
 * 但是该线程持有的资源锁并没有释放！若是其他线程调用该线程的中断，异常并返回！
 *除非是现线程中有锁的存在，否则可能会出现线程交叉输出的情况！
 *
 * 线程的静态方法 yield 使得该线程让出cpu的执行权，交给其他线程！
 * 这个方法就是暗示cpu调度器，本线程想让出cpu的执行权；
 * 让出cpu执行权后，线程处于就绪状态！优先级高的线程获取cpu的执行权！（可能再次有让出的线程获取！）
 * 该方法不常用！
 *
 * 线程的中断是通过设置线程的中断标志，使得线程自己根据中断状态处理；
 * 并不是直接强制的终结线程的执行；
 * 又在线程因为调用了wait，join，sleep系列函数阻塞挂起，线程才会在这些方法中调用出抛出中断异常；
 *  阻塞的线程进过中断，会重新激活！
 *  静态方法interrupted 获取当前线程的中断标志！在中断标志为true的时候清除状态，变为false;
 *  费静态方法 isInterrupt 直接获取调用他的线程的中断状态；不会改变状态！
 *
 *  多线程执行时，采用时间片轮转的调度策略；时间到，就会放出cpu的执行权，给其他的线程；线程退出保持就绪态！
 *  这就是上下文切换；每次都会在自己的栈和程序计数器中保存执行的进度！下次继续执行！
 *  上下文切换的时机：时间片用完！ 线程中断！
 *  对于阻塞的线程中断可能会唤醒，对于未阻塞的
 *
 *  线程的死锁：多个线程争夺资源过程中的互相等待；持有并等待：
 *  四个条件：资源的互斥： 持有并申请；不可剥夺条件；环路闭合！
 *  解除死锁只需要破坏其中一个条件即可！
 *  申请资源的有序性可避免死锁！使得不同的线程低于资源的申请顺序一致！
 *
 *  用户进程 userprecess ：例如jvm加载每一个main方法，就是一个用户进程；
 *  守护线程：后台运行的进程，比如垃圾回收线程；
 *  区别：所有的用户线程结束，jvm觉正常退出；而守护线程是否结束和jvm无关！
 *  想要在主线程接续后冒失的子线程继续工作，子线程工作完成后使得jvm结束；就将子线程设置了用户线程；
 *  否则就将线程设置为守护线程，主线程完事了就直接关闭了jvm进程！
 *
 *  ThreadLocal 线程的局部变量；多个线程对于一个共享变量访问，使用县城距不变领，复制一个变量到自己的线程的本地；
 *  自己线程的局部变量别的线程无法访问！因为只是在自己线程的内存中！
 *  每一个线程都有threadlocals和inheritablethreadlocals局部变量；地层都是hashmap结构的；
 *  线程的局部变量都方法在这里，而Threadlocal类的实例只不过是一个工具壳，
 *  通过set和get方法remove方法进行变量的额获取和转移；
 *
 *  利用当前线程获取线程本地内存的threadlocalMap ，此时，线程是key；
 *  获取了本地的局部变量，map；想要获取具体的值，此时ThreadLocal对象是key，value就是变量的值；
 *  每个线程内部的threadlocals是一个hashmap结构 ；key是Threadlocal引用，value是set的值；
 *  本地变量的值都存方在线程内部的内存变量中，需要及时的remove，否则变量满而溢出；
 *  ThreadLocal，对于不同的线程，父子线程是不能访问的！
 *
 *  为了子线程可以访问父线程：出现了InheritableThreadLocal类；这是一个继承类；
 *  因为线程中的另一个变量：inheritableThreadLocals，
 *  构造函数式父类的局部变量复制一份保存到了子类的局部变量；
 *
 *
 *
 *
 *
 *
 *
 *
 *

 *
 *
 */
public class Think21 {
}