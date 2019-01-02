class Value1{
    int i=1;
}

public class FinalData {
    final int I1=9;
    static final int I2=99;
    public static final int I3=39;
    final int i4=(int)(Math.random()*20);   //编译期间未知
    static final int i5=(int)(Math.random()*20);  //编译期间未知，在类载入时初始化

    Value1 v1=new Value1();
    final Value1 v2=new Value1();
    static final Value1 v3=new Value1();

    final int[] a={1,2,3,4,5,6};

    public void print(String id){
        System.out.println(id +":"+"i4 ="+i4 +",i5="+i5);
    }

    public static void main(String[] args){
        FinalData fd1 =new FinalData();
        fd1.print("fd1");
        fd1.v2.i++;
//        fd1.i1++;  无法改变值
        fd1.v1=new Value1();
        fd1.print("fd1");
        for(int i=0;i<fd1.a.length;i++){
            fd1.a[i]++;
//            fd1.v2=new Value1();
//            fd1.v3=new Value1();
//            fd1.a=new int[3];
        }

        fd1.print("fd1");
        System.out.println("Creating new FinalData");
        FinalData fd2=new FinalData();
        fd1.print("fd1");
        fd2.print("fd2");

    }
}
