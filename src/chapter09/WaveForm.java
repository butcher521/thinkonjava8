package chapter09;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:16 2020/5/24
 */
public class WaveForm {
    private static long counter;
    private final long id=counter++;

    @Override
    public String toString() {
        return "waveform"+id;
    }
}
class Filter{
    String name(){
       return getClass().getSimpleName();
    }
    WaveForm process (WaveForm waveForm){
        return waveForm;
    }
}
