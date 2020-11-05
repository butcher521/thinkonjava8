package chapter05;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 12:29 2020/5/23
 */
public enum Size {
    LITTLE,MIDDLE,LARGE
}
class Test{
    public static void main(String[] args) {
        for (Size s : Size.values()) {
            System.out.print(s+"  "+s.ordinal());
            switch (s){
                case LARGE:
                    System.out.println("这是大号");
                    break;
                case MIDDLE:
                    System.out.println("这是中号");
                    break;
                case LITTLE:
                    System.out.println("这是小号");
                    break;
            }
        }

    }
}