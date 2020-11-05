package chapter11;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:55 2020/5/28
 *
 * 第11章持有对象
 * 容器，里面传递引用型对象的对象的引用；但是不确定容器的大小；
 * java5之前的容器允许插入不同的数据类型，generics
 *不同的的抽象数据类型之间的转换会出现类型转换异常；
 * 可以制定泛型的容器中添加和泛型类的子类；涉及到向上转型；
 * 容器有两大类： collection是保存独立元素的序列；
 * 其中list必须按照插入的顺序保存，set不能有重复的元素，queue按照先进先出的形式保准顺序
 * map是保存键值对；其中通过键key来查找值value；
 * 创建容器的时候最好使用多态的向上转型；注意时刻追是否能转型成功；进行向下转型；
 * 工具类collections中的方法有执行的collection集合中添加元素；
 * Arrays的aslist可以添加指定的额数组成为一个大小固定的list集合;
 *
 *List
 * list有Arraylist 地层维数组，查询快，增删满和linkedlist 底层是链表，查询慢增删快；
 * Arraylist 方法 增删add remove 包含元素 contains ，包含多个 containAll（sub）
 * 添加集合 addAll 获取get，清除clear ，元素缩影indexof 大小 size 返回数组 toAarray（）；
 * sublist获取子集；set替换元素；
 * 迭代器，遍历集合的对象，有next，hasnext，iterator，remove的方法
 * 迭代器的子类：ListIterator，只能对于list类型进行访问；次迭代器可以双向移动；
 *
 * linkedList 底层是双向链表，可以实现的队列，双端队列，栈；
 *peek poll 获取头元素，一个不移除，一个衣橱，没有头元素就返回null；
 * 栈的底层可以实现；push和pop；
 *
 * set 不保存重复的元素；
 * hashset没有顺序，treeset按照结果升序；linkedhashset按照插入顺序排列；
 *
 * map是映射，由键查找值；
 * 添加元素put 获取元素get  是否包含键值对 containskey values
 * 键唯一，值不唯一；
 * map的遍历有两种，都是通过set的方法 一个是keyset 一个是entryset。
 *
 * 队列是queue先进先出，可以由双向链表实现；链表实现了队列的额接口！
 * 常用文件的按序传输。
 * 子类优先对象，按照元素的自然顺序升序排列，获取元素的时候按照优先级的顺序获取
 * 可以再构造器中重写comparator来自定义顺序！
 *
 * 迭代器和foreach的底层原理都是一样的，集合必然实现了iterable接口！
 * 通过内部类再次重写next和hasnext方法！
 *
 *
 *
 *
 *
 *
 */
public class Think11 {
}
