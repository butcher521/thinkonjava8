package chapter17;

import java.util.*;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:36 2020/6/3
 */
public class SlowMap<K,V> extends AbstractMap<K,V> {
    private List<K> keys=new ArrayList<>();
    private List<V> values=new ArrayList<>();
    public V put(K key,V value){
        V old = get(key);
        if(!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }else{
            values.set(keys.indexOf(key),value);
        }
        return old;
    }
    public V get(Object key){
        if(!keys.contains(key)){
            return null;
        }
            return values.get(keys.indexOf(key));


    }


    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        HashSet<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
       /* while (ki.hasNext()){
            set.add(new Entry<>(ki.next(),vi.next()));
        }
       return null;*/
       return null;
    }
}
class MpaEntry<K,V> implements Map.Entry<K,V>{
private K key;
private V value;

    public MpaEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V result = this.value;
        this.value=value;
        return result;
    }

    @Override
    public int hashCode() {
        return key==null?0:key.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
