package chapter15;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:48 2020/5/30
 */
public class StackTest<T> implements Iterable<T>{
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> n=head;
            @Override
            public boolean hasNext() {
                return n.next!=null;
            }

            @Override
            public T next() {
                return n.item;
            }
        };
    }

    private static  class Node<T>{
        T item;
        Node<T> next;

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
        boolean end(){
            return item==null&&next==null;
        }
    }
    private Node<T> head=new Node<>(null,null);
    public void push(T item){
       head= new Node<>(item, head);
    }
    public T pop(){
        T popResult = head.item;
        if(!head.end()){
             head = this.head.next;
        }
        return popResult;
    }

    public static void main(String[] args) {
        StackTest<String> list=new StackTest<>();
        for (String s : "pharse,oo,week".split(",")) {
            list.push(s);
        }
      /*  for (String s : list) {
            System.out.println(s);
        }*/
        String s;
        while ((s=list.pop())!=null){
            System.out.println(s);
        }
    }
}
