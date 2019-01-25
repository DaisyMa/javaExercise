import java.util.*;

public class Set1 {
    public static void testVisual(Set a){
        Collection1.fill(a);
        Collection1.fill(a);   //无法重复插入
        Collection1.fill(a);

        Collection1.print(a);

        a.addAll(a);   //可重复插入
        a.add("one");
        a.add("one");     //无法重复插入
        a.add("one");
        Collection1.print(a);
        System.out.println("a.contails(\"one\"):"+a.contains("one"));
    }

    public static void main(String[] args) {
        testVisual(new HashSet());    //散列函数
        testVisual(new TreeSet());
    }
}
