package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:16 2020/5/25
 */
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String id) {
                    this.id = id;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip slip = new TrackingSlip("slip");
            String id = slip.getSlip();
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel6=new Parcel6();
        parcel6.track();
    }
}
