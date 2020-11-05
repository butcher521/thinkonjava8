package chapter17;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 12:17 2020/6/2
 * 第17章 容器的深入研究
 *
 * 容器类库的分布图显示最大的就有collection和map
 * collection有list，set，和queue  ；
 * 在往下一级，每一个集合的超类都会有一个抽象的类 abstractlist set map
 * 如何想继承这些集合类，直接冲这些抽象类中继承即可；
 *扩充集合的方式，单一的赋值，Collections 中的ncopies 以及fill方法（此方法有限的替换集合中的元素）；
 * 每一个集合类都可以在集合中接受另一个集合类；
 *
 * collections 中的方法很多注意；retainall和removeall  一个求交集，一起溢出交集；
 *集合变为数组  toArray   数组变为集合  Arrays.asList();
 * aslistde 方法返回一个长度不可变的list集合；
 * 可以将此结果作为参数放入集合的构造器中或者addAll方法中，这样会变成一个长度可变的集合结构；
 *ArrayList 是一个线性数组实现的，内部按照插入书序排列，linkedList是双向链表实现！
 * set
 * 储存补充的的元素，因为有hashcode和equals方法；不通过的set内有有一种维护顺序；
 * hashset不保证顺序；treeset按照按照结果升序（ComparedTo比较）； linkedhashset按照插入排序；
 *
 * hashmap 个get方法并非是在线性搜获，而是散列码‘hashcode；这是一个相对位移，int表示，转化对象信息而来的；
 * 散列吗：数据是存储一组数据查询最快的，将键key对象生成一个数字（散列码），让这个数字作为数组的下标；
 * 不同的键可以有相同的下标，这样数组的大小就不重要了，总能在数组中找到这些下表；
 * 每个数组的索引出保存key的值得list；使用equals进行匹配；
 *
 *
 */
public class Think17 {
}
