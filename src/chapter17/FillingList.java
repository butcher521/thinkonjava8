package chapter17;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:30 2020/6/2
 */
class StringAddress{
    private String name;
    public StringAddress(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return super.toString()+name;
    }
}
public class FillingList {
    public static void main(String[] args) {
        ArrayList<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4,new StringAddress("我好")));
        System.out.println(list);
        Collections.fill(list,new StringAddress("你好"));
        System.out.println(list);
    }
}
