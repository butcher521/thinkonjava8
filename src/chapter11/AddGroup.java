package chapter11;

import chapter10.InheritInner;

import java.util.*;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:42 2020/5/28
 */
public class AddGroup {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] list={6,7,8,9,9};
        collection.addAll(Arrays.asList(list));
        Collections.addAll(collection,11,11,11,11);
        Collections.addAll(collection,list);
        List<Integer> array=Arrays.asList(1,2,3,4,5);/*固定的聚合！*/
        array.add(1);

    }
}
