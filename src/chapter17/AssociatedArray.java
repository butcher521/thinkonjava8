package chapter17;

import org.omg.CORBA.StringHolder;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:43 2020/6/3
 */
public class AssociatedArray<K,V> {
    private Object[][] pair;
    private int  index;
    public AssociatedArray(int length){
        pair= new Object[length][2];
    }
    public void put(K key,V value){
        if(index>=pair.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        pair[index++]=new Object[]{key,value};
    }
    public V get(K key){
        for (int i = 0; i < index; i++) {
            if(key.equals(pair[i][0])){
                return (V)pair[i][1];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < index; i++) {
            stringBuilder.append(pair[i][0].toString());
            stringBuilder.append(":");
            stringBuilder.append(pair[i][1].toString());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

    }
}
