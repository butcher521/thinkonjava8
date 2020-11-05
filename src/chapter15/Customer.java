package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:34 2020/6/2
 */
public class Customer {
    private static long counter;
    private final long id=counter++;
    public String toString(){
        return "Customer"+id;
    }
    /*利用方法*/
    public static Generator<Customer> generator(){
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
    /*利用成员变量*/
    public static Generator<Customer> generator=new Generator<Customer>() {
        @Override
        public Customer next() {
            return new Customer();
        }
    };
}

