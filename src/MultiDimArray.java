import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class MultiDimArray {
    static Random rand=new Random();

    static int pRand(int mod){
        return Math.abs(rand.nextInt())%mod +1;
    }

    static void prt(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        int[][] a1={{1,2,3},{4,5,6}};
        prt(Integer.toString(a1.length));
        for(int i=0;i<a1.length;i++){
            prt(String.valueOf(a1[i].length));
            for(int j=0;j<a1[i].length;j++){
                prt("a1["+i+"]["+j+"]="+a1[i][j]);
            }
        }

        Integer[][] a4={
                {new Integer(1),new Integer(2)},
                {new Integer(3),new Integer(4)},
                {new Integer(5),new Integer(6)}
        };
        for(int i=0;i<a4.length;i++){
            for (int j=0;j<a4[i].length;j++){
                prt("a4["+i+"]["+j+"]="+a4[i][j]);
            }
        }

        Integer[][] a5;
        a5=new Integer[3][];
        for(int i=0;i<a5.length;i++){
            a5[i]=new Integer[3];
            prt("a5.length="+Integer.toString(a5.length));
            for (int j=0;j<a5[i].length;j++){
                prt("a5["+i+"].length="+String.valueOf(a5[i].length));
                a5[i][j]=i*j;
            }
        }
        for (int i=0;i<a5.length;i++){
            for(int j=0;j<a5[i].length;j++){
                prt("a5["+i+"]["+j+"]="+a5[i][j]);
            }
        }
    }
}
