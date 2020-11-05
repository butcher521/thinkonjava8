package chapter09;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:50 2020/5/25
 */
public class Factory {
    public static void serviceConsumer(ServiceFactory serviceFactory){
        Service service = serviceFactory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(ServiceImp1.serviceFactory);
    }
}
interface Service{
        void method1();
        void method2();
    }
    interface ServiceFactory{
        Service getService();
}
class ServiceImp1 implements Service{
    @Override
    public void method1() {
        System.out.println("实现1方法一");
    }

    @Override
    public void method2() {
        System.out.println("实现一方法2");
    }
    public static ServiceFactory serviceFactory=new ServiceFactory() {
        @Override
        public Service getService() {
            return new ServiceImp1();
        }
    };
}

