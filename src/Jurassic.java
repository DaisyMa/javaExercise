import java.sql.SQLOutput;

class SmallBrain{
}

final class Dinosaur{
    int i=7;    //final 类中的变量可以被改变
    int j=1;
    SmallBrain x=new SmallBrain();
    void f(){

    }
}

public class Jurassic {

    public static void main(String[] args) {
        Dinosaur n=new Dinosaur();
        n.f();
        n.i=40;
        n.j++;
        System.out.println(n.i);
        System.out.println(n.j);
    }
}
