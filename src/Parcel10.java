abstract class Contents1{
    abstract public int value();
}

interface Destination1{
    String readLabel();
}

public class Parcel10 {
    private static class PContents1 extends Contents1{
        private int i=11;
        public int value(){
            return i;
        }
    }

    protected static class PDestination1 implements Destination1{
        private String label;
        private PDestination1(String whereTo){
            label=whereTo;
        }
        public String readLabel(){
            return label;
        }
    }

    public static Destination1 dest(String s) {
        return new PDestination1(s);
    }

    public static Contents1 cont(){
        return new PContents1();
    }

    public static void main(String[] args) {
        Contents1 c=cont();
//        Parcel10.PContents1 pp =new Parcel10.PContents1();
        Destination1 d=dest("test");
//        Parcel10.PContents1.readLabel();    //error
    }

}
