//: Main.java
import java.util.Date;

public class Main {
    /**
     * <pre>
     * @author daisy
     * @param args
     * System.out.println(new Date());
     * </pre>
     */
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Number n1=new Number();
        Number n2=new Number();
        n1.i=9;
        n2.i=5;
        System.out.println("n1:"+n1.i+"; n2:"+n2.i);

        n1=n2;  //将n2的句柄指向n1;n1和n2 使用相同的句柄

        System.out.println("n1:"+n1.i+"; n2:"+n2.i);
        n1.i=10;
//        n2.i=12;
        System.out.println("n1:"+n1.i+"; n2:"+n2.i);
    }
}
//: Main.java
