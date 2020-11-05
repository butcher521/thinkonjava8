package chapter22;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:14 2020/6/7
 * 第二章 并发变成的其他知识；
 * 并发：在一个时间段内多个任务同时执行：宏观同时，微观交错；
 * 并行：在一个单位时间多个任务同时执行；微观同时；
 * 由于线程的数量多于cpu，索引成为多线程并发编程；
 * 线程安全离不开对共享资源的访问;也就是读写；，多个线程对一个共享资源读写却不加任何的保护措施，出现问题；
 * 只读不写不会出现线程安全；
 * 解学问题，对于共享变量进行适当地同步，常用synchronized关键字；
 *
 * JAVA中共享变量的内存可见性：
 * java内存模型：线程使用变量，从主内存中赋值变量到给自线程的工作内存（私有的）；
 * 每一个线程的工作内存就是个子的私有的额一级缓存，多个线程公用二级缓存；对共享变量的读写时，
 * 各自线程的以及缓存是不可见的；这就导致共享变量内存不可见！
 *
 * synchronized 就是java内置锁，也叫做监视器锁，内部锁：使用者看不到，java内置；
 * 线程执行同步代码快的时候自动的获取内部锁，其他线程同时获取时将会被阻塞；
 * 释放内部锁：正常退出，异常抛出，同步块内部调用资源的wait方法；
 * 排他锁：线程之间的互斥；
 * 同步代码块会使得线程组设：用户态切换到内核态，上下文切换；耗时；（使用锁的开销）
 * 此代码块使用共享变量会从主内存中直接获取，而不是工作内存；避免了共享变量的内存不可见问题；
 * 进入synchronize代码块，就是将线程的变量从工作内存中清除，从主村中获取；
 * 退出代码块就是将块中修改的变量更新到主内存中；
 * 获取锁：清空本地工作变量，使得主内存中加载；
 * 释放锁：将在本地工作内存中修改的变量，更新到主内存中；
 *
 * 为了解决内存不可见性问题：提供了关键字volatile，弱形式的同步；
 * 确保一个变量的更新对于其他的线程马上可见！就是变量修改后直接刷新到主内存，不仅过一二级的缓存（工作内存）；
 * 线程写入volatile变量就是相当于代码块，将本地变量更新到内存；
 * 线程读取volatile变量就是进入代码块：将本地内存的变量清空，从主内存中重新加载；
 *
 * synchronized是独占锁，已有一个线程可以调用；并且会存在上下文切换的开销；提供可见性和原子性
 * volatile 是非阻塞的；不会造成线程的切换；只提供可见性；
 * 二者大部分时间是等价的：
 * 使用volatile的场景：
 * 写入变量值不依赖变量的当前值：
 * 读写变量值没有加锁：
 *
 * 原子性操作：要么全完成，玩么一个都完不成！
 * 例如计数器的基本操作：读改写必须全部进行完在执行洗衣歌，否则出问题；
 * 简单的i++ 将会分解为多个汇编语言，这就达不到原子性了！
 * 要求内存可见以及原子性；synchronize，但是这是独占锁；要用cas非阻塞操作！
 *
 * cas操作；就是compare and swap 比较和交换
 *
 * 使用volatile关键字，解决了指令重排序和内存可见性的操作；
 * 指令重新排序指的是：同一个线程中代码乱序！
 * 写变量，确保写之前的操作不会重排到写之后的操作；
 * 读变量：确保读之后的操作不会重排到读之前；
 * 也就是确保volatile修饰的变量能够现读取,再进行修改！
 *
 * cpu和主内存ram之间存在的速度差异，所以在二者之间设立了多级缓存！cache
 * 缓存一般是集成到cpu之中；常见；每一个核（一个处理器）有一个私有的一级缓存；
 * 所有的核共享一个2级缓存；
 * 缓存的内部是按照行存储的，每一行是2的幂次的字节数；
 * cpu获取变量先到缓存看，没有就从主内存中复制一个内存行到缓存中；
 * 此内存行中有多个变量；
 * 多个线程同时修改一个缓存行中的多个变量，单位时间只能有一个线程操作！这就是伪共享；
 * 缓存一致性协议：
 * 当CPU写数据时，如果发现操作的变量是共享变量，即在其他CPU中也存在该变量的副本，
 * 会发出信号通知其他CPU将该变量的缓存行置为无效状态，因此当其他CPU需要读取这个变量时，
 * 发现自己缓存中缓存该变量的缓存行是无效的，那么它就会从内存重新读取。
 *
 * 程序运行的局部性原则：如何缓冲中没有要求的变量，将会从主内存中获取一个缓存行大小的内存，其中包含了相邻的
 * 多个变量：这在单线程的数组顺序访问时很有用，效率高；但是跳跃性访问就不太好；
 * 对于多线程，由于环迅一致性原则：这样却很是浪费时间，资源；这也就是伪共享；共享了却不能用；
 * 避免伪共享：jdk8之前会填充数据，使得一个缓存行中只有一个有用数据；
 * jdk8加入了注解，contended；
 *
 * 锁概述
 * 根据线程获取锁的抢占机制：
 * 公平锁：先到先得；
 * 非公平锁：运行时闯入
 * 实现 reentrantlock   构造器中true为公平，false为不公平；
 * 一般，没有需求就使用非公平锁；
 *
 * 多个线程持有还是单个线程持有；分为独占锁和共享锁；
 * 独占锁：reentrantlock就是独占锁，悲观锁！一次只能一个线读操作！限制了并发性；
 * 共享锁;允许一个资源可以被多个线程读操作；乐观锁
 *可重入锁：一个线程再次获取一个自己已经获取了的锁，而不被阻塞挂起，这就是一个可冲入锁；
 * synchronize 内置锁就是一种可冲入锁；
 * 所得内部有一个线程的标识，如果不同的线程阻塞，入股如果相同的线程就会计数器加1减1操作；直到null，可以换线程；
 * 锁的获取和不获取，一般需要使线程从用户态到内核态的切换，唤醒或者阻塞，开销比较大；
 * 自旋锁：获取锁失败，不马上阻塞，所赐尝试获取锁，多次失败后再次阻塞；
 *
 * threadLocalrandom 并发情况下的随机数生成器；
 *
 *
 *
 *
 */
public class Think22 {
}