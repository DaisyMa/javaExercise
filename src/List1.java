import java.util.*;

public class List1 {
    public static List fill(List a){
        return (List)Collection1.fill(a);  //将fill方法返回的collection 造型为list
    }

    public static void print(List a){
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i)+" ");
        }
        System.out.println();
    }

    static boolean b;
    static Object o;
    static int i;
    static Iterator it;
    static ListIterator lit;

    public static void basicTest(List a){
        a.add(1,"x");
        print(a);
        a.add("x");   //在最末尾添加x
        print(a);

        a.addAll(fill(new ArrayList()));
        a.addAll(3,fill(new ArrayList()));

        print(a);
        b=a.contains("1");
        b=a.containsAll(fill(new ArrayList()));

        o=a.get(1);
        i=a.indexOf("1"); //从第0个元素开始查找与“1” 相等的元素，并返回该元素第一次出现的的索引位置
        i= a.indexOf("2");
        b=a.isEmpty();
        it=a.iterator();
        lit=a.listIterator();
        lit=a.listIterator(3);
        i=a.lastIndexOf("1");  //从第0个元素开始查找与“1” 相等的元素，并返回该元素最后一次出现的的索引位置
//        i=a.lastIndexOf("1",2);
        a.remove(1);
        a.remove("3");
        a.set(1,"y");
        a.retainAll(fill(new ArrayList()));
        a.removeAll(fill(new ArrayList()));
        i=a.size();
        a.clear();

    }

    public static void iterMotion(List a){
        ListIterator it=a.listIterator();
        b=it.hasNext();
        b=it.hasPrevious();
        o=it.next();
        i=it.nextIndex();
        o=it.previous();
        i=it.previousIndex();
    }
    public static void iterManipulation(List a){
        ListIterator it=a.listIterator();
        it.add(47);
        it.next();
        it.remove();
        it.next();
        it.set("47");
    }

    public static void testVisual(List a){
        print(a);
        List b=new ArrayList();
        fill(b);
        System.out.println("b=");
        print(b);
        a.addAll(b);
        a.addAll(fill(new ArrayList()));
        print(a);

        System.out.println(a.size());
        System.out.println(a.size()/2);

        ListIterator x=a.listIterator(a.size()/2);
        x.add("one");
        print(a);
        System.out.println(x.next());
        x.remove();
        System.out.println(x.next());
        x.set("47");
        print(a);
        x=a.listIterator(a.size());
        while(x.hasPrevious()){
            System.out.println(x.previous()+"");
        }
        System.out.println();
        System.out.println("testVisual finished");
    }

    public static void testLinkedList(){
        LinkedList ll=new LinkedList();
        Collection1.fill(ll,5);
        print(ll);

        ll.addFirst("one");
        ll.addFirst("two");
        print(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        print(ll);
    }

    public static void main(String[] args) {
        basicTest(fill(new LinkedList()));
        basicTest(fill(new ArrayList()));
        iterMotion(fill(new LinkedList()));
        iterMotion(fill(new ArrayList()));
        iterManipulation(fill(new LinkedList()));
        iterManipulation(fill(new ArrayList()));
        testVisual(fill(new LinkedList()));
        testLinkedList();
    }
}
