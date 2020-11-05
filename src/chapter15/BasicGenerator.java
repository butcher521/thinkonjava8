package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:19 2020/6/1
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator() {
    }

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> creat(Class<T> type){
        return new BasicGenerator<>(type);
    }
}
