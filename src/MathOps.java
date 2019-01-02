import java.util.Random;

public class MathOps {
    static void prt(String s){
        System.out.println(s);
    }
    static void pInt(String s,int i){
        prt(s+"="+i);
    }
    static void pFlt(String s,float f){
        prt(s+"="+f);
    }

    public static void main(String args[]){
        Random rand=new Random();
        int i,j,k;
        j=rand.nextInt()%100;
        k=rand.nextInt()%100;
        pInt("j",j);
        pInt("k",k);
        String s="abc";
        String q="abc";

        String w=new String();
        String e=new String();

        System.out.println(j==k);
        System.out.println(s==q);

        System.out.println(s.equals(q));
        System.out.println(w.equals(e));

        Value v1=new Value();
        Value v2=new Value();
        v1.i=v2.i=3;
        System.out.println(v1.equals(v2));

        v1=v2;
        v1.i=5;
        System.out.println(v1.equals(v2));



    }




}
