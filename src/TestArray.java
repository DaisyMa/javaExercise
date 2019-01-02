public class TestArray {
    TestArray(){
        prt("no args Constructor...");
    }

    TestArray(String s){
        prt(s);
        Integer a[][];
        prt("create a array");
    }
    static void prt(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        TestArray testArray=new TestArray();
        TestArray testArray1=new TestArray("arg");

    }

}
