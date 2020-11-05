package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:28 2020/6/1
 */
interface Generator<T>{
    T next();
}
public class Fibonacci implements Generator<Integer>{
    private int count=1;

    @Override
    public Integer next() {
        return fib(count++);
    }
    public int fib(int n){
        if (n<=0)return 0;
        if(n<=2) return 1;

        return fib(n-2)+fib(n-1);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 20; i++) {
            System.out.println(fibonacci.next());
        }
    }
}
