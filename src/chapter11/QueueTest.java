package chapter11;

import java.util.*;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:42 2020/5/28
 */
public class QueueTest implements Iterable,Comparable{
    public static  void printQ(Queue queue){
        while (queue.peek()!=null){
            System.out.println(queue.remove());
        }
    }

    public static void main(String[] args) {
       /* Queue<Integer> queue=new LinkedList<>();
        Random random=new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i+20)+20);
        }
        printQ(queue);
    }*/
        List<Integer> list=Arrays.asList(9,8,7,6,5,4,3,2,1);
        PriorityQueue<Integer> pq=new PriorityQueue<>(list);
        System.out.println(pq);
         PriorityQueue<Integer> p1=new PriorityQueue<>(list.size(), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        p1.addAll(list);
        System.out.println(list);


    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
