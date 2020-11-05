package chapter10;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 13:29 2020/5/25
 */
interface Con {
    int value();
}

interface Dest {
    String readLabel();
}

public class Parcel1 {
    private class Contents implements Con {
        private int i = 1;

        public int value() {
            return i;
        }
    }


    public Dest getDestination(String s) {
       class Destination implements Dest {
            private String label;

            Destination(String whereTo) {
                this.label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new Destination(s);
    }

    public void ship(String destination) {

        Dest dest = getDestination(destination);
        System.out.println(dest.readLabel());
    }


    public static void main(String[] args) {
        Parcel1 parcel1 = new Parcel1();
        parcel1.ship("China");


    }
}
