package chapter08;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:45 2020/5/24
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super s=new Sub();
        System.out.println(s.field+"和"+s.getField());

    }
}
class Super{
    public int field=0;
    public int getField(){
        return field;
    }
}
class Sub extends Super{
    public int field=1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
