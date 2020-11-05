package chapter14;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:33 2020/5/30
 */
interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("做点什么");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("做点其他的,比如：" + arg);
    }
}

class Proxy implements Interface {
    private Interface proxy;

    public Proxy(Interface proxy) {
        this.proxy = proxy;
    }

    @Override
    public void doSomething() {
        System.out.println("代理做点什么");
        proxy.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("代理做点别的比如："+arg);
        proxy.somethingElse(arg);

    }
}

public class SimplyProxy {
    public static void consumer(Interface proxy){
        proxy.doSomething();
        proxy.somethingElse("吃饭");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        System.out.println("===================");
        consumer(new Proxy(new RealObject()));
    }
}
