public class Parcel6 {
    public Contents cont(){
        return new Contents() {  //匿名内部类
          private int i=11;
          public int value(){
              return i;
          }
        };
    }

    public static void main(String[] args) {
        Parcel6 p=new Parcel6();
        Contents c=p.cont();
    }

}
