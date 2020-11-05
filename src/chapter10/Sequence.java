package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 13:59 2020/5/25
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] item;
    private int next = 0;

    public Sequence(int size) {
        item = new Object[size];
    }

    public void add(Object obj) {
        if (next < item.length) {
            item[next++] = obj;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == item.length;
        }

        @Override
        public Object current() {
            return item[i];
        }

        @Override
        public void next() {
            if (i < item.length) {
                i++;
            }
        }
    }
    public Selector getSelector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.getSelector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }


}
