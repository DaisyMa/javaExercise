class TestClass{
    final double i=Math.random();
    static double j=Math.random();
}

public class TestFinalStatic {
    public static void main(String[] args) {
        TestClass tc1=new TestClass();
        TestClass tc2=new TestClass();
        System.out.println(tc1.i);
        System.out.println(tc1.j);
        System.out.println(tc2.i);
        System.out.println(tc2.j);
    }
}



