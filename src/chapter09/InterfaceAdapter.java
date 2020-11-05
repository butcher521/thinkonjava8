package chapter09;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:58 2020/5/24
 */
public class InterfaceAdapter implements Pro {
    private Filter filter;
    public InterfaceAdapter(Filter filter){
       this.filter = filter;
    }
    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object obj) {
        return filter.process((WaveForm) obj);
    }
}
class Test{
    public static void main(String[] args) {
        WaveForm waveForm=new WaveForm();

    }
}
