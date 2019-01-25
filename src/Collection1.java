import java.util.*;

public class Collection1 {
    public static Collection fill(Collection c,int start,int size){
        for(int i=start;i<start+size;i++){
            c.add(Integer.toString(i));   //将整数转换为String
        }
        return c;
    }

    public static Collection fill(Collection c,int size){
        return fill(c,0,size);
    }

    public static Collection fill(Collection c){
        return fill(c,0,10);
    }

    public static Collection newCollection(){
        return fill(new ArrayList());     //将arrayList上溯造型为collection
    }

    public static Collection newCollection(int start,int size){
        return fill(new ArrayList(),start,size);
    }

    public static void print(Collection c){
        for(Iterator x=c.iterator(); x.hasNext();){
            System.out.println(x.next()+"");
        }
    }

    public static void main(String[] args) {
        Collection c=newCollection();
        c.add("ten");
        c.add("eleven");
//        print(c);

        Object[] array=c.toArray();
        String[] str=(String[])c.toArray(new String[1]);

        System.out.println("Collection.max(c)="+Collections.max(c));
        System.out.println("Collection.min(c)="+Collections.min(c));
        c.addAll(newCollection());
//        print(c);
        c.remove("3");   //去掉第一个3
//        print(c);
        c.remove("3");
//        print(c);
        c.removeAll(newCollection());
        print(c);
        c.addAll(newCollection());
        print(c);
        System.out.println("c.contains(\"4\")="+c.contains("4"));
        System.out.println("c.containsAll(newCollection())="+c.containsAll(newCollection()));

        Collection c2=newCollection(5,3);
        print(c2);
        c.retainAll(c2);  //保留指定元素
        print(c);
        c.removeAll(c2);
        System.out.println("c.isEmpty()="+c.isEmpty());
        c=newCollection();
        print(c);
        c.clear();       //清除所有元素
        System.out.println("after c.clear():");
        print(c);
    }
}
