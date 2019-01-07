public class Parcel5 {
    private void internalTracking(boolean b) {
        if (b) {

            class TrackingSlip {                //在作用域中创建内部类，
                private String id;

                TrackingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }

//        TrackingSlip ts =new TrackingSlip();   //在作用域中创建的内部类，不能在作用域外使用
    }
    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel5 p=new Parcel5();
        p.track();
    }


    }

