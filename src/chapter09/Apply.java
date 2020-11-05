package chapter09;

import java.util.Arrays;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 20:49 2020/5/24
 */
public class Apply {
    public static void process(Processor p, Object obj) {
        System.out.println("类名为" + p.name());
        System.out.println(p.process(obj));
    }
}

interface Pro {
    String name();
    Object process(Object obj);
}

abstract class Processor implements Pro {
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract Object process(Object obj);

    public static String s = "jqdqdq qwdihqwldj wqdjoqwj  wqodq wiqdjoi";

    public static void main(String[] args) {
        Apply.process(new UpCase(), s);
        Apply.process(new UpCase(), s);
        Apply.process(new Splitter(), s);
    }

}

class UpCase extends Processor {
    public String process(Object obj) {
        return ((String) obj).toUpperCase();
    }
}

class Lower extends Processor {
    public String process(Object obj) {
        return ((String) obj).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    public Object process(Object obj) {
        return Arrays.toString(((String) obj).split(" "));
    }
}
