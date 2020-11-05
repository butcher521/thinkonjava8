package chapter19;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:56 2020/6/3
 */
public enum Destination {
    WEST("西"),
    EAST("东"),
    NORTH("北"),
    SOUTH("南");
    private String description;
    Destination(String description){
        this.description=description;
    }public String getDescription(){
        return description;
    }


    public static void main(String[] args) {
        for (Destination s : Destination.values()) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        String id=name();
        String lower=id.substring(1).toLowerCase();
        return id.charAt(0)+lower;
    }
}
