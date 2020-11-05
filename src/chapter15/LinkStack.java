package chapter15;

import java.util.LinkedList;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:27 2020/5/30
 */
public class LinkStack<T> {
    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head;
    private int N;

    public LinkStack() {
        head = new Node(null, null);
        N = 0;
    }

    public void push(T item) {
        Node first = new Node(item, null);
        Node oldFirst = head.next;
        head.next=first;
        first.next=oldFirst;
        N++;
    }
    public T pop(){
        Node oldFirst = head.next;
        Node nextNode = oldFirst.next;
        head.next=oldFirst.next;
        N--;
        return oldFirst.item;

    }


}
