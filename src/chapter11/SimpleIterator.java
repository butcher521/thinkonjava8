package chapter11;

import java.util.*;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:25 2020/5/28
 */
public class SimpleIterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
       /* Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            iterator.remove();
            System.out.println(i);
        }
        System.out.println("============");
        System.out.println(list);
        */
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){
            System.out.print(it.previousIndex()+"和");
            System.out.println(it.nextIndex()+"元素是"+it.next());
        }
    }
}
