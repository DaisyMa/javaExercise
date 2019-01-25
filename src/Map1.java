import java .util.*;

public class Map1 {
    public final static String[][] testData1={
            {"Happy","Cheerful"},
            {"Sleepy","Prefers"},
            {"Doc","Fan"}
    };

    public final static String[][] testData2={
            {"Bell","Dis"},
            {"Lazy","Moti"},
            {"com","Exc"}
    };
    public static Map fill(Map m ,Object[][] o){
        for(int i=0;i<o.length;i++){
            m.put(o[i][0],o[i][1]);
        }
        return m;
    }

    public static void printKeys(Map m){   //map的key迭代
        System.out.println("Size="+m.size()+",");
        System.out.println("Keys:");
        System.out.println(m.keySet());
    }

    public static void printValue(Map m){   //map的value迭代
        System.out.println("Values:");
        System.out.println(m.values());
    }

    public static void print(Map m){    //map反复，迭代器
        Collection entries=m.entrySet();
        Iterator it=entries.iterator();
        while (it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();
            System.out.println("Key="+e.getKey()+",Value="+e.getValue());
        }
    }


    public static void test(Map m){
        fill(m,testData1);
        fill(m,testData1);
        printKeys(m);
        printValue(m);
        print(m);
        String key=testData1[1][0];
        String value=testData1[1][1];
        System.out.println("m.containsKey(\""+key+"\"):"+m.containsKey(key));
        System.out.println("m.get(\""+key+"\"):"+m.get(key));
        System.out.println("m.contailnsValue(\""+value+"\"):"+m.containsValue(value));

        Map m2=fill(new TreeMap(),testData2);
        m.putAll(m2);
        printKeys(m);
        m.remove(testData2[0][0]);
        printKeys(m);
        print(m);
        m.clear();
        System.out.println("m.isEmpty():"+m.isEmpty());
        fill(m,testData1);
        m.keySet().removeAll(m.keySet());
        System.out.println("m.isEmpty():"+m.isEmpty());
    }

    public static void main(String[] args) {
        System.out.println("Testing HashMap");
        test(new HashMap());
        System.out.println("Testing TreeMap");
        test(new TreeMap());
    }
}
