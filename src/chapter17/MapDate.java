package chapter17;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:00 2020/6/2
 */
class Pair<K,V>{
    final K key;
    final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
public class MapDate<K,V> extends LinkedHashMap<K,V> {
    public MapDate(Generator<Pair<K,V>> gen,int quantity){
        for (int i = 0; i < quantity; i++) {
            Pair<K, V> p = gen.next();
            put(p.key,p.value);
        }
    }
    public MapDate(Generator<K> genK,Generator<V> genV,int quantity){
        for (int i = 0; i < quantity; i++) {
            put(genK.next(),genV.next());
        }
    }
    public MapDate(Generator<K> genK,V value,int quantity){
        for (int i = 0; i < quantity; i++) {
            put(genK.next(),value);
        }
    }
    public MapDate(Iterable<K> genK,Generator<V> genV){
        for (K key : genK) {
            put(key,genV.next());
        }
    }
    public MapDate(Iterable<K> genK,V value){
        for (K key : genK) {
            put(key,value);
        }
    }
  /*  public static <K,V> MapDate<K,V> map(){
        return new MapDate<K,V>();
    }*/



}
