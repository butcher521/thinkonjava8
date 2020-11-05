package chapter11;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:49 2020/5/28
 */
public class StackImplement<T> {
    private LinkedList<T> list=new LinkedList<>();
    public void push(T t){
        list.addFirst(t);
    }
    public T pop(){
        return list.removeFirst();
    }
    public T peek(){
        return list.getFirst();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
